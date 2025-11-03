public class Macbook {
     String tipo;
    String marca;
    String color;
    String tamaño;

    public Macbook(String tipo, String marca, String color, String tamaño) {
          this.tipo = tipo;
            this.marca = marca;
             this.color = color;
              this.tamaño = tamaño;
    }

    void encender() {
        System.out.println("La MacBook " + tipo + " se ha encendido.");
        System.out.println("---------------------------------------------------------");
    }
    
}
