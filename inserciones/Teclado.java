public class Teclado {
       String marca;
    String tipo;
    String conexion;

    public Teclado(String marca, String tipo, String conexion) {
        this.marca = marca;
        this.tipo = tipo;
        this.conexion = conexion;
    }

    public void conectar() {
        System.out.println("  Conectando teclado...");
        System.out.println("Marca: " + marca);
          System.out.println("Tipo: " + tipo);
           System.out.println("Conexión: " + conexion);
          System.out.println("--------------------------------------------------");
    
}

}