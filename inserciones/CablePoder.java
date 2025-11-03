public class CablePoder {
    String longitud;
    String material;
    String tipo;
    String conector;

    public CablePoder(String longitud, String material, String tipo, String conector) {
        this.longitud = longitud;
        this.material = material;
        this.tipo = tipo;
        this.conector = conector;
    }

    public void conectar() {
        System.out.println("🔌 Conectando cable de poder...");
        System.out.println("Longitud: " + longitud);
        System.out.println("Material: " + material);
        System.out.println("Tipo: " + tipo);
        System.out.println("Conector: " + conector);
        System.out.println("--------------------------------------------------");
    }
}

