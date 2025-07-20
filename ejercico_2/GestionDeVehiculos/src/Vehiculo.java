public class Vehiculo {
String marca;
int modelo;
int velocidadMaxima;
public Vehiculo(String marca, int modelo, int velocidadMaxima) {
    this.marca = marca;
    this.modelo = modelo;
    this.velocidadMaxima = velocidadMaxima;
}
public String getMarca() {
    return marca;
}
public void setMarca(String marca) {
    this.marca = marca;
}
public int getModelo() {
    return modelo;
}
public void setModelo(int modelo) {
    this.modelo = modelo;
}
public int getVelocidadMaxima() {
    return velocidadMaxima;
}
public void setVelocidadMaxima(int velocidadMaxima) {
    this.velocidadMaxima = velocidadMaxima;
}

public void mostrarDetalles(){
    System.out.println("Marca : "+marca);
    System.out.println("Modelo : "+modelo);
    System.out.println("Velocidad maxima :"+velocidadMaxima );}

}
