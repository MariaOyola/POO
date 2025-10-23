public class Intructor {

    String nombre;
    String apellido;
    int edad;
    String direccion;

    public Intructor(String nombre, String apellido, int edad, String direccion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.direccion = direccion;
    }

    public void escribir() {
        System.out.println(" Escribiendo el informe del instructor...");
          System.out.println("Nombre: " + nombre + " " + apellido);
           System.out.println("Edad: " + edad);
         System.out.println("Dirección: " + direccion);
           System.out.println("--------------------------------------------------");
    }
}
