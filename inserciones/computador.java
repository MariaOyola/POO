public class computador {

    String material; 
    String color; 
    String  tipo; 

    public computador (String material,  String color, String  tipo) {
        this.material = material; 
        this.color =  color; 
        this.tipo = tipo; 


    }
    public void Apagar() {
        System.out.println(" es hora de apagar el computador de " + material);
        System.err.println("marca: " + material );
        System.out.println("color: " + color);
        System.err.println("tipo : " + tipo);
        System.out.println("------------------------------------------------------------");
    }
    
}
  