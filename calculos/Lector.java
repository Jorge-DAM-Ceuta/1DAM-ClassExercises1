package calculos;

import java.util.Scanner;

public class Lector {
   
    private Scanner scan=new Scanner(System.in);
    private static int lecturasNum=0;
    private static int lecturasText=0;
    private int entero;
    private double decimal;
    private String texto;
    
    /*Lector(int e, double d, String t){
    }*/
    
    Lector(){
        entero=0;
        decimal=0;
        texto="";
    }
    
    public void leerEntero(){
        System.out.println("Introduce un número entero:");
        entero=scan.nextInt();
        lecturasNum++;
    }
    
    public void leerDouble(){
        System.out.println("Introduce un número decimal:");
        decimal=scan.nextDouble();
        lecturasNum++;
    }
    
    public void leerString(){       
        System.out.println("Introduce un texto:");
        texto=scan.nextLine();
        lecturasText++;
    }
    
    public void printEntero(){
    System.out.println("El número introducido es " + entero);
    }
    
    public void printDouble(){
    System.out.println("El número decimal introducido es " + decimal);
    }
    
    public void printString(){
    System.out.println("La cadena introducido es " + texto);
    }
    
    public int getLecturasnum(){
    return lecturasNum;
    }
    public int getLecturastext(){
    return lecturasText;
    }
}
