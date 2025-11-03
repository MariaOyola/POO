
  public class Candado {
    String marca;
    String tipo;
    String color;
    int tamaño;

    public Candado(String marca, String tipo, String color, int tamaño) {
        this.marca = marca;
        this.tipo = tipo;
        this.color = color;
        this.tamaño = tamaño;
    }

    void abrir() {
        System.out.println("El candado se ha abierto.");
    }

}

