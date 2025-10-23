public class Mesas {

    String material; 
    String color; 
    String forma; 

    public Mesas (String material, String color, String forma) {
        this.material = material; 
        this.color = color; 
        this.forma = forma; 

    }

    public void poner_objeto() {
        System.out.println("poner un objeto en la mesa de " +  forma);
        System.out.println("material: " + material);
        System.out.println("Color: " + color);
        System.out.println("forma :" + forma);
        System.out.println("-------------------------------------------------------------");

    } 
    

}
