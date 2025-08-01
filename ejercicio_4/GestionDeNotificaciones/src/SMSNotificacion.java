public class SMSNotificacion implements INotificaciones{

    @Override
    public void Enviar(String mensaje) {
       System.out.println("enviando sms: "+mensaje);
    }

}
