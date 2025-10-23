public class botella {
String ancho; 
String color; 
String material; 
String tipo; 


public botella (String ancho, String color, String material, String tipo) {
    this.ancho = ancho; 
    this.color = color; 
    this.material = material; 
    this.tipo = tipo; 
}

public void  tomar_liquido () {
    System.out.println("---- el  usuario toma del la botella " + tipo + "---------------------");
    System.out.println("Ancho: " + ancho );
     System.out.println("Color: " + color  );
      System.out.println("Material: " + material  );
      System.out.println("-----------------------------");


}
}

    
