public class Aire {
    
    String temperatura;
    String marca; 
    String  estado; 

    public Aire ( String temperatura, String marca, String  estado) {
        this.temperatura = temperatura;
        this.marca = marca; 
        this.estado = estado; 


    }

    public void encender() {
        System.out.println(" Ensenser el aire a " + temperatura);
        System.out.println("temperatura: " + temperatura);
        System.err.println("marca: " + marca);
        System.out.println(" estado: " + estado);
        System.out.println("---------------------------------------------------------");

        
    }
}
