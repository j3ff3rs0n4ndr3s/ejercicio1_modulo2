public class Main {
    public static void main(String[] args) throws Exception {
        
      carro carro1 = new carro("chevrolet", 2015, 180, 4);
      Moto moto1 = new Moto("Suzuki", 2020, 150, false);
      carro carro2 = new carro("Renolt", 2025, 200, 2);
      Moto moto2 = new Moto("Yamaha", 2021, 250, true);
    
      carro1.mostrarDetalles();carro1.Puertas();
      moto1.mostrarDetalles();moto1.sidecar();
      carro2.mostrarDetalles();carro2.Puertas();
      moto2.mostrarDetalles();moto2.sidecar();


    }
}
