

public class Main {
    

    public static void main(String[] args) throws Exception {
       Bitcoin bitcoin = new Bitcoin(0.00001);
       bitcoin.obtenerDetalles();
       bitcoin.validarMonto(bitcoin.monto);
       bitcoin.procesarPago(bitcoin.monto);
        Bitcoin bitcoin2 = new Bitcoin(0.01);
       bitcoin2.obtenerDetalles();
       bitcoin.validarMonto(bitcoin2.monto);
       bitcoin.procesarPago(bitcoin2.monto);
       PayPal paypal = new PayPal(0.5);
       paypal.obtenerDetalles();
       paypal.validarMonto(paypal.monto);
       paypal.procesarPago(paypal.monto);
       PayPal paypal2 = new PayPal(100);
       paypal2.obtenerDetalles();
       paypal2.validarMonto(paypal2.monto);
       paypal2.procesarPago(paypal2.monto);
       TarjetaCredito tarjetaCredito = new TarjetaCredito(0);
       tarjetaCredito.obtenerDetalles();
       tarjetaCredito.validarMonto(tarjetaCredito.monto);
       tarjetaCredito.procesarPago(tarjetaCredito.monto);
       TarjetaCredito tarjetaCredito2 = new TarjetaCredito(10);
       tarjetaCredito2.obtenerDetalles();
       tarjetaCredito2.validarMonto(tarjetaCredito2.monto);
       tarjetaCredito2.procesarPago(tarjetaCredito2.monto);
       TarjetaRegalo tarjetaRegalo = new TarjetaRegalo(0);
       tarjetaRegalo.obtenerDetalles();
       tarjetaRegalo.validarMonto(tarjetaRegalo.monto);
       tarjetaRegalo.procesarPago(tarjetaRegalo.monto);
       TarjetaRegalo tarjetaRegalo2 = new TarjetaRegalo(200);
       tarjetaRegalo2.obtenerDetalles();
       tarjetaRegalo2.validarMonto(tarjetaRegalo2.monto);
       tarjetaRegalo2.procesarPago(tarjetaRegalo2.monto);
       TransferenciaBancaria transferenciaBancaria = new TransferenciaBancaria(9);
       transferenciaBancaria.obtenerDetalles();
       transferenciaBancaria.validarMonto(transferenciaBancaria.monto);
       transferenciaBancaria.procesarPago(transferenciaBancaria.monto);
        TransferenciaBancaria transferenciaBancaria2 = new TransferenciaBancaria(20);
       transferenciaBancaria2.obtenerDetalles();
       transferenciaBancaria2.validarMonto(transferenciaBancaria2.monto);
       transferenciaBancaria2.procesarPago(transferenciaBancaria2.monto);

    }
}
