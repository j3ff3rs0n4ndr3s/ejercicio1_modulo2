public interface MetodoPago {
void procesarPago(double monto);
void obtenerDetalles();
boolean validarMonto(double monto);
}
