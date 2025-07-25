public class TarjetaRegalo implements MetodoPago{
    double monto;
    
    public TarjetaRegalo(double monto) {
        this.monto = monto;
    }

    

    @Override
    public void obtenerDetalles() {
     System.out.println("monto mayor a 0 y menor o igual a 500"); 
       
    }

    @Override
    public boolean validarMonto(double monto) {
       if (monto > 0 && monto <= 500 ) {
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
