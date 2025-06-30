public class Estudiante {

    String nombre;
    int edad;
    Double promedio;
    public Estudiante(String nombre, int edad, Double promedio) {
        this.nombre = nombre;
        this.edad = edad;
        this.promedio = promedio;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public Double getPromedio() {
        return promedio;
    }
    public void setPromedio(Double promedio) {
        this.promedio = promedio;
    }

    public void mostrarDetalles(){

        System.out.println("Nombre del estudiante : "+nombre);
        System.out.println(" Edad : "+edad);
        System.out.println("Promedio : "+promedio);
        if (esAprobado()==true) {
         System.out.println("Si aprobo");   
        }
        else{
            System.out.println("No aprobo");
        }
    }

    public Boolean esAprobado(){
        if (promedio >= 3.0) {
            return true;
        }
        else {
            return false;
        }
    }
}