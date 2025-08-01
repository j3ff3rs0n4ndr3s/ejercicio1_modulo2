public class Main {
    public static void main(String[] args) throws Exception {
        
      Cocina cocina = new Cocina("arroz con pollo");
      Mesero mesero = new Mesero("arroz con pollo");
      Caja caja = new Caja("10,000 pesos");

      Restaurante restaurante = new Restaurante(cocina,mesero,caja);
      restaurante.operarRestaurante();
      
       

    }
}
