public class gafas {

        String material; 
     String color; 
     String tipo;


     public gafas (String material, String color, String tipo) {
        
        this.tipo = tipo; 
        this.color  = color ; 
        this.material =  material; 
    
     }

     public void poner () {
        System.out.println("Ponerse gadas de " + tipo);
         System.out.println("material : " + material);
         System.out.println("color  " + color);
        System.out.println(" tipo : " + tipo);
    
         System.err.println("------------------------------------------------------------");

         }
    
}
