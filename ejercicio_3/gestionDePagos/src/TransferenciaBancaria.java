public class TransferenciaBancaria implements MetodoPago {
     double monto;
     
    public TransferenciaBancaria(double monto) {
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
       System.out.println("monto debe ser igual o mayor a 10"); 
       
    }

    @Override
    public boolean validarMonto(double monto) {
        if (monto >= 10) {
           return true;
        } else {
            return false;
        }
    }

}
