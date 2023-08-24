package COMPARENDOGRUPO2;

import java.util.HashMap;
import java.util.Map;

class Comparendo {
    private Map<String, TipoVehiculo> TipoVehiculoMap = new HashMap<>();
    private CorreoService correoService;

    public Comparendo(CorreoService correoService) {
        this.correoService = correoService;
        initializeTipoVehiculo();
    }

    private void initializeTipoVehiculo() {
        TipoVehiculoMap.put("CARRO", new TipoVehiculo(65, 66, 85));
        TipoVehiculoMap.put("CAMION", new TipoVehiculo(75, 76, 95));
        TipoVehiculoMap.put("MULA", new TipoVehiculo(95, 96, 110));
    }

    public int calcularComparendo(int velocidad, String tipoVehiculo) {
        TipoVehiculo limits = TipoVehiculoMap.get(tipoVehiculo);
        if (limits == null) {
            return -1;
        }
        return limits.getComparendo(velocidad);
    }

    public void construirFotoMulta(int velocidad, String tipoVehiculo) {
        int cpa = calcularComparendo(velocidad, tipoVehiculo);
        String txt = enviarCorreoFotomulta(tipoVehiculo);
        if (cpa == -1) {
            System.out.println("no hay cálculo para el tipo de vehículo " + tipoVehiculo + ", correo: " + txt);
        } else {
            System.out.println("El tipo de comparendo es: " + cpa + ", cuerpo del correo:\n" + txt);
        }
    }

    public String enviarCorreoFotomulta(String tipoVehiculo) {
        correoService.enviarCorreo(tipoVehiculo);
        return correoService.getMensajeCorreo(tipoVehiculo);
    }
}
