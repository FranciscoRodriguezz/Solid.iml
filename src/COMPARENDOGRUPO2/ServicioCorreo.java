package COMPARENDOGRUPO2;

class ServicioCorreo implements CorreoService {
    private String mensajeCorreo;

    public void enviarCorreo(String tipoVehiculo) {
        String cuerpoMensaje = "//enviando correo para el tipo " + tipoVehiculo + ".";
        String asunto = "//asunto: comparendo " + tipoVehiculo.toLowerCase();
        mensajeCorreo = asunto + "\n" + cuerpoMensaje;
        System.out.println(mensajeCorreo);
    }

    public String getMensajeCorreo(String tipoVehiculo) {
        return mensajeCorreo;
    }
}
