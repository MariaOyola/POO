public class Mouse {
   String marca;
    String tipo;
    String conexion;
    String modelo;

    public Mouse(String marca, String tipo, String conexion, String modelo) {
        this.marca = marca;
        this.tipo = tipo;
        this.conexion = conexion;
        this.modelo = modelo;
    }

    public void conectar() {
        System.out.println(" Conectando mouse...");
          System.out.println("Marca: " + marca);
           System.out.println("Tipo: " + tipo);
            System.out.println("Conexión: " + conexion);
           System.out.println("Modelo: " + modelo);
          System.out.println("--------------------------------------------------");
    }
} 
