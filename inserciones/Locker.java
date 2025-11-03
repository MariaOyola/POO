public class Locker {
  
    String color;
    String material;
    int numero;

    public Locker(String color, String material, int numero) {
        this.color = color;
        this.material = material;
        this.numero = numero;
    }

    public void abrir() {
        System.out.println("🔒 Abriendo locker...");
        System.out.println("Color: " + color);
        System.out.println("Material: " + material);
        System.out.println("Número: " + numero);
        System.out.println("--------------------------------------------------");
    }
}


