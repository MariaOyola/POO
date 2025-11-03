public class sillas {
       String material; 
     String color; 
     String altura;


     public  sillas (String material, String color, String altura) {
    
        this.color  = color ; 
        this.material =  material; 
        this.altura = altura; 
    
     }

     public void senatrse () {
        System.out.println(" ese usuario se sienta en la silla  de " + material);
         System.out.println("material : " + material);
         System.out.println("color  " + color);
        System.out.println(" altura : " + altura);
    
         System.err.println("------------------------------------------------------------");

    
}
}

