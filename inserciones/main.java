public class main {

    public static void main(String[] args) {
        
        botella botella1 = new botella("10", "Amarilla", "plastico" , "cuatro"); 
         botella botella2 = new botella("5", "marron", "videro", "poni. malta" );
          botella botella3  = new botella("15", "roja", "metal", "Coca cola " );
           botella botella4   = new botella("20", "Azul", "acrilico", "postobon" );
            botella botella5   = new botella("25", "transparente", "polietileno", " agua" );
         
            botella1.tomar_liquido();
            botella2.tomar_liquido();
            botella3.tomar_liquido();
            botella4.tomar_liquido();
            botella5.tomar_liquido();



    escoba escoba1 = new escoba(" 20", "Morado", "plastico", " sala de intructores"); 
     escoba escoba2 = new escoba(" 21", "rosada", "madera", "ambientes"); 
      escoba escoba3 = new escoba(" 25", "amarilla", "bidrio" , " patio"); 
       escoba escoba4 = new escoba(" 15", "azul", "metal", "parqueadero"); 
        escoba escoba5 = new escoba(" 10", "verde ", "pastico", " parque"); 

            escoba1.Barrer();
            escoba2.Barrer();
            escoba3.Barrer();
            escoba4.Barrer();
            escoba5.Barrer();


    puerta puerta1 = new puerta("10", "20", "20" , "ambiente 209 -1");
    puerta puerta2 = new puerta("15", "25", "30" , "ambiente 209 -2");
    puerta puerta3  = new puerta("32", "23", "23" , "ambiente 209 -3");
     puerta puerta4  = new puerta("40", "22", "22" , "ambiente 209 -4");
      puerta puerta5   = new puerta("26", "30", "30" , "ambiente 209 -5");


    puerta1.abrir(); 
    puerta2.abrir();
    puerta3.abrir();
    puerta4.abrir();
    puerta5.abrir();


     platos platos1 = new platos("platico ", "Amarillo", "plato extendido"); 
     platos platos2 = new platos ("vidrio ", " rojo", "plato de postre "); 
     platos platos3 = new  platos ("metal ", "metal", "plato hondo"); 
     platos platos4 = new  platos ("acrilico ", "azul", "plato de taza"); 
     platos platos5 = new platos  ("polietileno ", "morado", "plato de pan"); 

     platos1.servir_comida();
     platos2.servir_comida();
     platos3.servir_comida();
     platos4.servir_comida();
     platos5.servir_comida();


     gafas gafas1 = new gafas("De sol", "Plástico", "Negro");
       gafas gafas2  = new gafas ("De lectura", "Metal", "Plateado");
       gafas gafas3 = new  gafas  ("De seguridad", "Policarbonato", "Transparente");
       gafas gafas4 = new gafas ("De moda", "Acetato", "Rojo");
       gafas gafas5 = new gafas ("De realidad virtual", "Plástico reforzado", "Negro y azul");

       gafas1.poner();
       gafas2.poner();
       gafas3.poner();
       gafas4.poner();
       gafas5.poner();

       cargador cargador1 = new cargador ("USB-C", "20V", "Negro");
     cargador cargador2 = new cargador ("Micro-USB", "5V", "Blanco");
      cargador cargador3 = new cargador ("Lightning", "9V", "Gris");
      cargador cargador4 = new cargador ("Magnético", "15V", "Azul");
      cargador cargador5 = new cargador ("Inalámbrico", "10V", "Verde");

      cargador1.conectar();
      cargador2.conectar();
      cargador3.conectar();
      cargador4.conectar();
      cargador5.conectar();


cuaderno c1 = new cuaderno("Cuadriculado", "100", "Blanco");
cuaderno c2 = new cuaderno("Rayado", "80", "Azul");
cuaderno c3 = new cuaderno("Liso", "150", "Verde");
cuaderno c4 = new cuaderno("Dibujo", "50", "Amarillo");
cuaderno c5 = new cuaderno("Punteado", "120", "Rojo");

        c1.abrir();
        c2.abrir();
        c3.abrir();
        c4.abrir();
        c5.abrir();

sillas s1 = new sillas("Madera", "Marrón", "Alta");
sillas s2 = new sillas("Plástico", "Blanco", "Baja");
sillas s3 = new sillas("Metal", "Negra", "Mediana");
sillas s4 = new sillas("Cuero", "Roja", "Alta");
sillas s5 = new sillas("Tela", "Gris", "Reclinable");


s1.senatrse();
s2.senatrse();
s3.senatrse();
s4.senatrse();
s5.senatrse();

    Aire a1 = new Aire("18°C", "Samsung", "Encendido");
        Aire a2 = new Aire("22°C", "LG", "Apagado");
 Aire a3 = new Aire("16°C", "Daikin", "Encendido");
    Aire a4 = new Aire("20°C", "Whirlpool", "Mantenimiento");
        Aire a5 = new Aire("24°C", "Panasonic", "Apagado");

        a1.encender();
        a2.encender();
        a3.encender();
        a4.encender();
        a5.encender();

           Mesas m1 = new Mesas("Madera", "Café", "Rectangular");
        Mesas m2 = new Mesas("Metal", "Negro", "Redonda");
        Mesas m3 = new Mesas("Vidrio", "Transparente", "Cuadrada");
        Mesas m4 = new Mesas("Plástico", "Blanco", "Ovalada");
        Mesas m5 = new Mesas("Bambú", "Verde", "Rectangular");

        m1.poner_objeto();
        m2.poner_objeto();
        m3.poner_objeto();
        m4.poner_objeto();
        m5.poner_objeto();


        computador co1 = new computador("Plástico", "Negro", "Portátil");
        computador co2 = new computador("Metal", "Gris", "Escritorio");
        computador co3 = new computador("Aluminio", "Plateado", "Todo en uno");
        computador co4 = new computador("Vidrio", "Blanco", "Gamer");
        computador co5 = new computador("Carbono", "Azul", "Ultrabook");

        co1.Apagar();
        co2.Apagar();
        co3.Apagar();
        co4.Apagar();
        co5.Apagar();

        tv t1 = new tv("100cm", "60cm", "Samsung QLED", "Smart TV");
tv t2 = new tv("120cm", "70cm", "LG OLED", "4K");
tv t3 = new tv("90cm", "55cm", "Sony Bravia", "Full HD");
tv t4 = new tv("80cm", "50cm", "TCL", "LED");
tv t5 = new tv("110cm", "65cm", "Hisense", "Android TV");

t1.encender();
t2.encender();
 t3.encender();
 t4.encender();
 t5.encender();

 HDMI h1 = new HDMI("HDMI 2.0", "1.5m", "Entrada estándar");
   HDMI h2 = new HDMI("HDMI 2.1", "2m", "Entrada ARC");
 HDMI h3 = new HDMI("HDMI básico", "3m", "Entrada mini");
HDMI h4 = new HDMI("HDMI Pro", "5m", "Entrada 8K");
HDMI h5 = new HDMI("HDMI Ultra", "10m", "Entrada DisplayPort");

h1.conectar();
 h2.conectar();
  h3.conectar();
 h4.conectar();
  h5.conectar();

    CableAudio cableAudio1 = new CableAudio("Jack 3.5mm", "1m", "Cobre");
  CableAudio cableAudio2 = new CableAudio("RCA", "2m", "Aluminio");
 CableAudio cableAudio3 = new CableAudio("Óptico", "1.5m", "Fibra");
   CableAudio cableAudio4 = new CableAudio("USB-C", "0.8m", "Nylon");
    CableAudio cableAudio5 = new CableAudio("Auxiliar", "3m", "Plástico");

  cableAudio1.conectar();
 cableAudio2.conectar();
   cableAudio3.conectar();
 cableAudio4.conectar();
 cableAudio5.conectar();

  CablePoder cou1 = new CablePoder("1m", "Cobre", "Trenzado", "Conector IEC");
         CablePoder cou2 = new CablePoder("2m", "Aluminio", "Redondo", "Conector tipo C");
         CablePoder cou3 = new CablePoder("3m", "Cobre", "Blindado", "Conector AC");
          CablePoder cou4 = new CablePoder("1.5m", "Plástico", "Flexible", "Conector USB");
           CablePoder cou5 = new CablePoder("5m", "Fibra", "Trenzado", "Conector universal");

          cou1.conectar();
        cou2.conectar();
        cou3.conectar();
          cou4.conectar();
           cou5.conectar();


            Teclado to1 = new Teclado("Logitech", "Mecánico", "USB");
        Teclado to2 = new Teclado("HP", "Membrana", "Inalámbrico");
          Teclado to3 = new Teclado("Razer", "Mecánico RGB", "USB-C");
        Teclado to4 = new Teclado("Microsoft", "Ergonómico", "Bluetooth");
          Teclado to5 = new Teclado("Redragon", "Gamer", "USB");

          to1.conectar();
        to2.conectar();
        to3.conectar();
        to4.conectar();
        to5.conectar();

Mouse mo1 = new Mouse("Razer", "Óptico", "USB", "DeathAdder V2");
        Mouse mo2 = new Mouse("Genius", "Láser", "Bluetooth", "DX-120");
        Mouse mo3 = new Mouse("Logitech", "Inalámbrico", "USB", "M185");
        Mouse mo4 = new Mouse("HP", "Ergonómico", "USB", "X500");
        Mouse mo5 = new Mouse("Corsair", "Gamer RGB", "USB-C", "Dark Core Pro");
   

        mo1.conectar();
        mo2.conectar();
        mo3.conectar();
        mo4.conectar();
        mo5.conectar();

         Bombillo b1 = new Bombillo("LED", "9W");
           Bombillo b2 = new Bombillo("Halógeno", "50W");
            Bombillo b3 = new Bombillo("Incandescente", "60W");
              Bombillo b4 = new Bombillo("Fluorescente", "15W");
               Bombillo b5 = new Bombillo("RGB Inteligente", "12W");

          b1.encender();
           b2.encender();
             b3.encender();
              b4.encender();
               b5.encender();

               Cartuchera car1 = new Cartuchera("Roja", "Mediana", "Cuero");
        Cartuchera car2 = new Cartuchera("Azul", "Grande", "Tela");
        Cartuchera car3 = new Cartuchera("Negra", "Pequeña", "Plástico");
        Cartuchera car4 = new Cartuchera("Verde", "Mediana", "Sintético");
        Cartuchera car5 = new Cartuchera("Rosa", "Grande", "Lona");

        car1.abrir();
        car2.abrir();
        car3.abrir();
        car4.abrir();
        car5.abrir();

         Locker l1 = new Locker("Gris", "Metal", 1);
            Locker l2 = new Locker("Azul", "Metal", 2);
             Locker l3 = new Locker("Rojo", "Madera", 3);
            Locker l4 = new Locker("Verde", "Plástico", 4);
         Locker l5 = new Locker("Negro", "Metal", 5);

           l1.abrir();
            l2.abrir();
          l3.abrir();
           l4.abrir();
            l5.abrir();

             Llave lv1 = new Llave("Plateada", "Pequeña", "Puerta principal");
        Llave lv2 = new Llave("Dorada", "Mediana", "Puerta trasera");
        Llave lv3 = new Llave("Negra", "Pequeña", "Candado de bici");
        Llave lv4 = new Llave("Roja", "Grande", "Puerta del garaje");
        Llave lv5 = new Llave("Azul", "Mediana", "Caja fuerte");

        lv1.abrir(); 
          lv2.abrir(); 
           lv3.abrir(); 
            lv4.abrir(); 
             lv5.abrir();

    Candado ca1 = new Candado ("Combinación", "Metal", "Negro", 3);
      Candado ca2 = new Candado("Llave", "Hierro", "Plateado", 29);
        Candado ca3 = new Candado("Digital", "Acero", "Gris",  30);
          ca1.abrir();
           ca2.abrir(); 
           ca3.abrir(); 
      

          piso p1 = new piso("Cerámica", "Blanco");
        piso p2 = new piso("Madera", "Café");
        piso p3 = new piso("Mármol", "Gris");
        piso p4 = new piso("Vinilo", "Negro");
        piso p5 = new piso("Cemento", "Beige");

          p1.limpiar();
            p2.limpiar();
              p3.limpiar(); 
               p4.limpiar();
                 p5.limpiar();


 pared pu1 = new pared("Blanca", "Cemento", 2.5, 15);
        pared pu2 = new pared("Gris", "Ladrillo", 3.0, 20);
        pared pu3 = new pared("Azul", "Bloque", 2.8, 18);
        pared pu4 = new pared("Verde", "Madera", 2.2, 12);
        pared pu5 = new pared("Roja", "Yeso", 2.7, 10);
 pu1.limpiar();
  pu2.limpiar();
        pu3.limpiar();
          pu4.limpiar();
           pu5.limpiar();


         Techo te1 = new Techo("Madera", "Blanco", 2.8, "Plano");
        Techo te2 = new Techo("Metal", "Gris", 3.0, "Inclinable");
        Techo te3 = new Techo("Concreto", "Beige", 2.5, "Doble capa");
        Techo te4 = new Techo("Teja", "Rojo", 2.9, "Colonial");
        Techo te5 = new Techo("PVC", "Blanco", 2.6, "Falso techo");

        
          te1.limpiar();
          te2.limpiar();
            te3.limpiar();
        te4.limpiar();
          te5.limpiar();

                Intructor i1 = new Intructor("Carlos", "Pérez", 35, "Calle 10 #12-30");
        Intructor i2 = new Intructor("María", "Gómez", 29, "Carrera 5 #45-20");
        Intructor i3 = new Intructor("Luis", "Martínez", 40, "Av. Siempre Viva 123");
        Intructor i4 = new Intructor("Ana", "Ramírez", 33, "Calle 20 #8-15");
        Intructor i5 = new Intructor("Jorge", "López", 50, "Carrera 7 #60-40");
          i1.escribir();
            i2.escribir(); 
             i3.escribir();
             i4.escribir(); 
        i5.escribir();

     Aprendiz ap1 = new Aprendiz("María", "López", 20, "Calle 10 #5-20");
          Aprendiz ap2 = new Aprendiz("Valery", "Pérez", 22, "Carrera 15 #8-33");
           Aprendiz ap3 = new Aprendiz("Mariana", "Gómez", 19, "Av. Central 40-12");
            Aprendiz ap4 = new Aprendiz("Natalia ", "Torres", 25, "Calle 7 #9-60");
             Aprendiz ap5 = new Aprendiz("Daniel", "Rodríguez", 21, "Calle 20 #12-30");

       ap1.escribir();
          ap2.escribir();
           ap3.escribir();
           ap4.escribir();
            ap5.escribir();


     Macbook ma1 = new Macbook("Pro", "Apple", "Gris", "13 pulgadas");
        Macbook ma2 = new Macbook("Air", "Apple", "Plateado", "15 pulgadas");
        Macbook ma3 = new Macbook("Pro", "Apple", "Negro", "14 pulgadas");
        Macbook ma4 = new Macbook("Air", "Apple", "Rosado", "13 pulgadas");
        Macbook ma5 = new Macbook("Pro", "Apple", "Gris oscuro", "16 pulgadas");

        ma1.encender();
         ma2.encender();
          ma3.encender();
           ma4.encender();
            ma5.encender();

                    Router r1 = new Router("TP-Link", "WiFi 6", "AX1800", "Pequeño", "1200 Mbps");
        Router r2 = new Router("Huawei", "Fiber", "HG8145V5", "Mediano", "1000 Mbps");
        Router r3 = new Router("Asus", "Gaming", "RT-AX86U", "Grande", "5700 Mbps");
        Router r4 = new Router("Linksys", "Dual Band", "E8450", "Pequeño", "1800 Mbps");
        Router r5 = new Router("Netgear", "WiFi 6E", "RAXE500", "Grande", "11000 Mbps");

          r1.encender();
             r2.encender();
              r3.encender();
               r4.encender();
                r5.encender();

    }


}



