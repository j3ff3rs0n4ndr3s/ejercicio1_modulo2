public class Main {
    public static void main(String[] args) throws Exception {
        
     CorreoNotificacion correo1 = new CorreoNotificacion();
     correo1.Enviar("ya esta la documentacion");
     SMSNotificacion sms1 = new SMSNotificacion();
     sms1.Enviar("ya esta la comida");
     PushNotificacion push1 = new PushNotificacion();
     push1.Enviar("ya llego luis diaz al Bayer");
    }
}
