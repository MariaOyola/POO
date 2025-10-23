public class Llave {

      String color;
    String tamaño;
    String puerto;

    public Llave(String color, String tamaño, String puerto) {
        this.color = color;
        this.tamaño = tamaño;
        this.puerto = puerto;
    }

    public void abrir() {
        System.out.println(" Abriendo con llave...");
        System.out.println("Color: " + color);
        System.out.println("Tamaño: " + tamaño);
        System.out.println("Puerto: " + puerto);
        System.out.println("--------------------------------------------------");


    
}
}
