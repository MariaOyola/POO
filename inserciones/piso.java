public class piso {

      String material;
    String color;

    public piso(String material, String color) {
        this.material = material;
        this.color = color;
    }

    public void limpiar() {
        System.out.println(" Limpiando el piso...");
        System.out.println("Material: " + material);
        System.out.println("Color: " + color);
        System.out.println("--------------------------------------------------");
    }
}

