public class Bitcoin implements MetodoPago {
    double monto;

    
    public Bitcoin(double monto) {
        this.monto = monto;
    }

    

    @Override
    public void obtenerDetalles() {

       System.out.println("monto minimo 0.001 BTC"); 
       
       
    }

    @Override
    public  boolean validarMonto(double monto) {
        if (monto >= 0.001) {
            return true;
        }
        else{
            return false;
        }
      
    }
@Override
    public void procesarPago(double monto) {
        if (validarMonto(monto) == true) {
           System.out.println("monto valido procesando pago por :"+monto+"Bitcoin"); 
           System.out.println(" su pago a sido realizado exitosamente");
        }else{
            System.out.println(" monto invalido por favor procesar nuevamente");
        }
         
      
    }
}
