package calculos;

import java.util.Scanner;

public class Cuestionario {
    
    private Scanner scan=new Scanner(System.in);
    private static int registros=0;
    private String nombre;
    private String genero;
    private int edad;
    private String estado_civil;
    private double sueldo;
    
    Cuestionario(){
        nombre="";
        genero="";
        edad=0;
        estado_civil="";
        sueldo=0;
        registros++;
            
    }
    
    public void miNombre(){
        System.out.println("Introduce tu nombre: ");
        nombre=scan.nextLine();
    }
    public void miGenero(){
        System.out.println("Introduce tu genero (h / m / o): ");
        genero=scan.nextLine();
    }
    public void miEdad(){
        System.out.println("Introduce tu edad: ");
        edad=scan.nextInt();
    }
    public void miEstado_civil(){
        System.out.println("Introduce tu estado civil (c / s): ");
        estado_civil=scan.nextLine();
    }
    public void miSueldo(){
        System.out.println("Introduce tu sueldo: ");
        sueldo=scan.nextDouble();
    }
    public void miCuestionario(){
    miNombre();
    miGenero();
    miEstado_civil();
    miSueldo();
    miEdad();
    
    
    }
    
    
    public void printNombre(){
        System.out.println("El nombre introducido es: " + nombre);
    }
    public void printGenero(){
        System.out.println("El genero introducido es: " + genero);
    }
    public void printEdad(){
        System.out.println("La edad introducida es: " + edad);
    }
    public void printEstado_civil(){
        System.out.println("El estado civil introducido es: " + estado_civil);
    }
    public void printSueldo(){
        System.out.println("El sueldo introducido es: " + sueldo);
    }
    public void printRegistros(){
    System.out.println("Hay " + registros + " registros.");
    }
    public void printTodo(){
        printNombre();
        printGenero();
        printEdad();
        printEstado_civil();
        printSueldo();
        printRegistros();
    }
    
    
    public String getNombre(){
        return nombre;
    }
    public String getGenero(){
        return genero;
    }
    public int getEdad(){
        return edad;
    }
    public String getEstado_civil(){
        return estado_civil;
    }
    public double getSueldo(){
        return sueldo;
    }
    public int getRegistros(){
        return registros;
    }
    
    
    public void setNombre(String x){
        nombre=x;
    }
    public void setGenero(String x){
        genero=x;
    }
    public void setEdad(int x){
        edad=x;
    }
    public void setEstado_civil(String x){
        estado_civil=x;
    }
    public void setSueldo(double x){
        sueldo=x;
    }
    
    
}
