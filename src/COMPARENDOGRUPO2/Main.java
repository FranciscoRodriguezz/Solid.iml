package COMPARENDOGRUPO2;



public class Main {

    public static void main(String[] args) {
        CorreoService correoService = new ServicioCorreo();
        Comparendo comparendo = new Comparendo(correoService);

        comparendo.construirFotoMulta(80, "CARRO");
        comparendo.construirFotoMulta(200, "MULA");
        comparendo.construirFotoMulta(40, "CAMION");
        comparendo.construirFotoMulta(40, "AVION");
    }
}


