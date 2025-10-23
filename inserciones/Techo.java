public class Techo {
 
    String material;
    String color;
    double altura;
    String tipo;

    public Techo(String material, String color, double altura, String tipo) {
        this.material = material;
        this.color = color;
        this.altura = altura;
        this.tipo = tipo;
    }

    public void limpiar() {
        System.out.println(" Limpiando el techo...");
        System.out.println("Material: " + material);
        System.out.println("Color: " + color);
        System.out.println("Altura: " + altura + " m");
        System.out.println("Tipo: " + tipo);
        System.out.println("--------------------------------------------------");
    }
}

