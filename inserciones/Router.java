public class Router {
      String marca;
    String tipo;
    String modelo;
    String tamaño;
    String velocidad;

    public Router(String marca, String tipo, String modelo, String tamaño, String velocidad) {
        this.marca = marca;
        this.tipo = tipo;
        this.modelo = modelo;
        this.tamaño = tamaño;
        this.velocidad = velocidad;
    }

    void encender() {
        System.out.println("El router " + marca + " está encendido.");
        System.out.println("---------------------------------------------------");
    }

    
}
