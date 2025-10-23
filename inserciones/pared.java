public class pared {
    String color;
    String material;
    double altura;
    double grosor;

    public pared(String color, String material, double altura, double grosor) {
        this.color = color;
        this.material = material;
        this.altura = altura;
        this.grosor = grosor;
    }

    public void limpiar() {
        System.out.println(" Limpiando la pared...");
        System.out.println("Color: " + color);
        System.out.println("Material: " + material);
        System.out.println("Altura: " + altura + " m");
        System.out.println("Grosor: " + grosor + " cm");
        System.out.println("--------------------------------------------------");
    }
}

