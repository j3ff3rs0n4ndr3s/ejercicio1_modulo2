public class Moto extends Vehiculo {

boolean tieneSideCar; 

public Moto(String marca, int modelo, int velocidadMaxima, boolean tieneSideCar) {
        super(marca, modelo, velocidadMaxima);

    }

public boolean isTieneSideCar() {

    return tieneSideCar;
}

public void setTieneSideCar(boolean tieneSideCar) {
    this.tieneSideCar = tieneSideCar;
}

public void sidecar(){
   
    if (tieneSideCar == true) {
        System.out.println("Si tiene sidecar");
    }
    else{
        System.out.println(" No tiene sidecaR");
    }
}

}
