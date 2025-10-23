public class CableAudio {

    String tipo;
     String longitud;
      String material;

    public CableAudio(String tipo, String longitud, String material) {
          this.tipo = tipo;
         this.longitud = longitud;
        this.material = material;
    }

    public void conectar() {
          System.out.println("Conectando cable de audio tipo " + tipo);
         System.out.println("Tipo: " + tipo);
        System.out.println("Longitud: " + longitud);
          System.out.println("Material: " + material);
           System.out.println("--------------------------------------------------");
}
}