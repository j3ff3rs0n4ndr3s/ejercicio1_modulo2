public class CorreoNotificacion implements INotificaciones {

    @Override
    public void Enviar(String mensaje) {
       System.out.println("enviando correo: "+mensaje);
    }

}
