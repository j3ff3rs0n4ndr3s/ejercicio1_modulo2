public class TarjetaCredito implements MetodoPago{
    double monto;
    
    public TarjetaCredito(double monto) {
        this.monto = monto;
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

    @Override
    public void obtenerDetalles() {
         System.out.println("monto mayor a 0"); 
       
    }

    @Override
    public boolean validarMonto(double monto) {
        if (monto > 0) {
            return true;
        }else{
            return false;
        }
    }

}
