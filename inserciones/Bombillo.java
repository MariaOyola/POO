public class Bombillo {

        String tipo;
    String potencia;

    public Bombillo(String tipo, String potencia) {
        this.tipo = tipo;
        this.potencia = potencia;
    }

    public void encender() {
        System.out.println(" Encendiendo bombillo...");
        System.out.println("Tipo: " + tipo);
        System.out.println("Potencia: " + potencia);
        System.out.println("--------------------------------------------------");
    }
}
