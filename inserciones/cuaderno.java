public class cuaderno {
    String  tipo;
    String color;
    String numero_de_hojas; 

    public  cuaderno ( String numero_de_hojas, String color, String tipo) {
        this.numero_de_hojas = numero_de_hojas; 
        this.color = color; 
        this.tipo = tipo; 
    }

    public void abrir() {
        System.out.println(" Abrir un cuaderno de " + tipo);
         System.out.println("tipo: " + tipo);
        System.out.println("numero de hojas: " + numero_de_hojas);
        System.out.println("color de hojas: " + color);
      
    }

}
