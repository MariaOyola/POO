public class tv {
    String ancho;
    String alto;
    String modelo;
    String tipo;

    public tv(String ancho, String alto, String modelo, String tipo) {
        this.ancho = ancho;
        this.alto = alto;
        this.modelo = modelo;
        this.tipo = tipo;
    }

    public void encender() {
        System.out.println("Encendiendo televisor " + modelo);
        System.out.println("Ancho: " + ancho);
        System.out.println("Alto: " + alto);
        System.out.println("Modelo: " + modelo);
        System.out.println("Tipo: " + tipo);
        System.out.println("--------------------------------------------------");
    }
}


