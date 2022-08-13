package calculos;

import java.util.Scanner;

public class Coche {
    
    private Scanner scan=new Scanner(System.in);
    private int velocidad;
    private String marca;
    private String modelo;
    private static int numerodecoches=0;
    private static int concesionario=0;
    
    Coche(){
        velocidad=0;
        marca="";
        modelo="";
        numerodecoches++;
        concesionario++;
    }
    
    Coche(int v, String ma, String mo){
    velocidad=v;
    marca=ma;
    modelo=mo;
    numerodecoches++;
    concesionario++;
    }
    
    Coche(String ma, String mo){
    velocidad=0;
    marca=ma;
    modelo=mo;
    numerodecoches++;
    concesionario++;
    }
    
    public int getVelocidad(){
        return velocidad;
    }
    
    public void acelera(int acel){
        velocidad+=acel;
    }
    
    public void frena(int decel){
        velocidad-=decel;
    }
    
    public void leerMarcayModelo(){
        System.out.println("Introduce la marca: ");
        marca=scan.nextLine();
        System.out.println("Introduce el modelo: ");
        modelo=scan.nextLine();
    }
    
   public void cocheToString(){
   System.out.println("Velocidad: " + velocidad + " Marca: " + marca + " Modelo: " + modelo);
   }
   
   public void printNumerodecoches(){
   System.out.println(numerodecoches);
   }
   
   public int getNumerodecochesEnconcesionario(){
   return numerodecoches;
   }
}
