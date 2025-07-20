public class carro extends Vehiculo{

int numeroDePuertas;

public carro(String marca, int modelo, int velocidadMaxima ,int numeroDePuertas) {
        super(marca, modelo, velocidadMaxima);
        this.numeroDePuertas = numeroDePuertas;
    }

public int getNumeroDePuertas() {
    return numeroDePuertas;
}

public void setNumeroDePuertas(int numeroDePuertas) {
    this.numeroDePuertas = numeroDePuertas;
}

public void Puertas(){
System.out.println("Numero de puertas : "+numeroDePuertas);
}
    
}

