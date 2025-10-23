public class platos {
    String  material; 
     String color; 
     String forma;


     public platos (String material, String color, String forma) {
        
        this.color = color; 
        this.forma = forma; 
        this.material = material; 
    
     }

     public void servir_comida () {

        System.out.println(" Servir comida en un plato de comida un un  " + material);
        System.out.println("material : " + material);
         System.out.println("colorl : " + color);
          System.out.println(" forma: " + forma);
          System.out.println("----------------------------------------------------------------");
         }
    
}


