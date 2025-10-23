public class cargador {
    String tipo; 
    String voltaje; 
    String color; 

    public  cargador ( String tipo, String voltaje, String color ) {
        this.tipo= tipo; 
         this.voltaje= voltaje; 
          this.color = color; 
    }

    public void conectar () {
        System.out.println(" conectar cargadores de " + tipo + " economicos");

        System.out.println("tipo: " + tipo);
        System.out.println("voltaje: " + voltaje);
        System.out.println("color: " + color);
        System.out.println("--------------------------------------------------");

    }
    
}
