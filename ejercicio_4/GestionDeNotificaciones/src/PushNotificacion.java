public class PushNotificacion implements INotificaciones{

    @Override
    public void Enviar(String mensaje) {
      System.out.println("enviando Push: "+mensaje);
    }

}
