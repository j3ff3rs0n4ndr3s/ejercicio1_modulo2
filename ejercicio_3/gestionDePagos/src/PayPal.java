public class PayPal implements MetodoPago{
    double monto;
    
    public PayPal(double monto) {
      this.monto = monto;
   }

   

    @Override
    public void obtenerDetalles() {
          System.out.println("monto debe estar entre 1 y 10_000 "); 
         
    }

    @Override
    public boolean validarMonto(double monto) {
       if (monto >= 1 && monto <=10_000) {
        return true;
        
       }else{
          return false;
       }
    }
     @Override
     public void procesarPago(double monto) {
        if (validarMonto(monto) == true) {
           System.out.println("monto valido procesando pago por :"+monto); 
           System.out.println(" su pago a sido realizado exitosamente");
        }else{
            System.out.println(" monto invalido por favor procesar nuevamente");
        }
         
      
    }

}
