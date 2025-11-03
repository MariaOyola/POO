public class Cartuchera {
    String color;
    String tamaño;
    String material;

    public Cartuchera(String color, String tamaño, String material) {
        this.color = color;
        this.tamaño = tamaño;
        this.material = material;
    }

    public void abrir() {
        System.out.println("Abriendo cartuchera...");
        System.out.println("Color: " + color);
        System.out.println("Tamaño: " + tamaño);
        System.out.println("Material: " + material);
        System.out.println("--------------------------------------------------");
    }
}
