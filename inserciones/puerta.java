public class puerta {
    String ancho; 
    String largo; 
    String  alto; 
    String  lugar; 

    public  puerta  (String ancho, String largo, String alto, String lugar) {
    this.ancho = ancho; 
    this.largo = largo; 
    this.alto = alto; 
    this.lugar = lugar; 


    }

    public void  abrir() {
        System.out.println("--- Ingresa  a la puerta que queda en el " + lugar + "----------");

     System.out.println("Ancho: " + ancho );
     System.out.println("alto: " + alto);
     System.out.println("largo: " + largo  );
     System.out.println("-----------------------------");


    }
}
