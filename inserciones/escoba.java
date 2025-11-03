public class escoba {
    String largo; 
    String color; 
    String material;
    String lugar; 

    public  escoba (String largo, String color, String material, String lugar) {
    this.largo = largo; 
    this.color = color; 
    this.material = material; 
    this.lugar = lugar; 

    
}

public void  Barrer() {
    System.out.println("---- el  usuario barre  el " + lugar + " ----------------------------");

    System.out.println("Lugar " + lugar);
    System.out.println("largo: " + largo );
     System.out.println("Color: " + color  );
      System.out.println("Material: " + material  );
      System.out.println("-----------------------------");
}


}