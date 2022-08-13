package calculos;


public class Main {

    
    
    public static void main(String[] args) {
        
        /*Calculadora cal;
        double resultado;
        cal=new Calculadora();
        cal.setN1(2.0);
        cal.setN2(3.1);
        resultado=cal.suma();
        //resultado=cal.resta();
        //resultado=cal.multiplicacion();
        //resultado=cal.division();
        cal.getN1();
        cal.getN2();
        cal.printN1();
        cal.printN2();
        System.out.println(cal.getContador());*/
        
        
        /*Temperatura medicion;
        medicion=new Temperatura();
        medicion.CelsiusToFarenheit(2.2);
        medicion.FarenheitToCelsius(200.4);
        System.out.println(medicion.FarenheitToCelsius(68.5));*/
        
        
        /*Coche vel=new Coche();
        Coche vel1=new Coche(40, "BMW", "cupra");
        Coche vel2=new Coche("BMW", "oro");
        vel.acelera(70);
        vel.frena(50);
        System.out.println(vel.getVelocidad());
        //vel.leerMarcayModelo();
        vel.cocheToString();
        vel1.cocheToString();
        vel2.cocheToString();
        System.out.println(vel.getNumerodecochesEnconcesionario());*/
        
        
        /*Pajaro carpintero;
        carpintero=new Pajaro();
        carpintero.setEdad(3);
        carpintero.printEdad();
        carpintero.setColor('r');*/
        
        
        /*Rebajas precio;
        precio=new Rebajas();
        double original=104;
        double rebaja=100;
        System.out.println("El porcentaje es de:" + precio.descubrePorcentaje(original,rebaja)+'%');*/
        
        
        /*Scanner scan;
        scan=new Scanner(System.in);
        double numero_decimal;
        String cadena;
        cadena=scan.nextLine();
        System.out.println("Introduce un número entero:");
        numero_decimal=scan.nextDouble();
        System.out.println("El número introducido es:" + numero_decimal);*/
        
        
        /*Lector lec;
        lec=new Lector();
        
        lec.leerEntero();
        lec.printEntero();
        
        lec.leerDouble();
        lec.printDouble();
        
        lec.leerString();
        lec.printString();
        
        System.out.println(lec.getLecturasnum());
        System.out.println(lec.getLecturastext());*/
        
        
        /*Cuestionario cue,cue1;
        cue=new Cuestionario();
        
        //cue.miCuestionario();
        
        cue.getNombre();
        cue.getGenero();
        cue.getEdad();
        cue.getEstado_civil();
        cue.getSueldo();
        cue.getRegistros();
        
        cue.setNombre("Jorge");
        cue.setGenero("Hombre");
        cue.setEdad(18);
        cue.setEstado_civil("Soltero");
        cue.setSueldo(20000);
        
        cue.printTodo();*/ //He añadido dos métodos get y print con el atributo registros y he incrementado su valor solo en el constructor... Creo que haría falta volver a inicializar el mismo código al finalizar su ejecución.
        
        
        /*Finanzas e;
        e=new Finanzas();
        System.out.println(e.dolarestoEuros(10));*/
        
        
        /*Satelite a=new Satelite(45.3, 64.4, 300.25);
        System.out.println(a.enOrbita());
        a.variaAltura(13.3);
        a.variaPosicion(44.3, 66.1);
        a.printPosicion();*/
        
        
        /*GestionaCompras a=new GestionaCompras();
        a.leerCompra();
        System.out.println(a.aplicaDescuento(-5.3));
        a.printResumen();*/
    
        Peso p=new Peso(30);
        p.printPeso();
        
        
    }
}
