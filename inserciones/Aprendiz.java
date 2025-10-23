public class Aprendiz {

     String nombre;
    String apellido;
    int edad;
    String direccion;

    public Aprendiz(String nombre, String apellido, int edad, String direccion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.direccion = direccion;
    }
    void escribir() {
        System.out.println(nombre + " está escribiendo.");
        System.out.println("apellido:" + apellido);
        System.out.println("edad: " + edad);
        System.out.println("direccion: " + direccion);
        System.out.println("------------------------------------------------------------");
    }

    
}
