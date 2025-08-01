public class Restaurante {

private Cocina cocina;
private Mesero mesero;
private Caja caja;
public Restaurante(Cocina cocina, Mesero mesero, Caja caja) {
    this.cocina = cocina;
    this.mesero = mesero;
    this.caja = caja;
}


public void operarRestaurante(){
    cocina.prepararPlato();
    mesero.servirPlato();
    caja.procesarPago();
}



}

