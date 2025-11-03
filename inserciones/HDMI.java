public class HDMI {
    String modelo;
     String largura;
    String tipoEntrada;

    public HDMI(String modelo, String largura, String tipoEntrada) {
          this.modelo = modelo;
         this.largura = largura;
         this.tipoEntrada = tipoEntrada;
    }

    public void conectar() {
        System.out.println("Conectando cable HDMI " + modelo);
          System.out.println("Modelo: " + modelo);
           System.out.println("Largura: " + largura);
         System.out.println("Tipo de entrada: " + tipoEntrada);
        System.out.println("--------------------------------------------------");
    } 
}

