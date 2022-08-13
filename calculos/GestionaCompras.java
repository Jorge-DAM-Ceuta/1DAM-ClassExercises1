package calculos;

import java.util.Scanner;
import economics.Finanzas;

public class GestionaCompras {
    private Scanner scan=new Scanner(System.in);
    private Finanzas actual;
           
    private int cantidad_productos;
    private double precio_compra;
    private static int numClientes;
    private int cliente;
    
    GestionaCompras(){
    cantidad_productos=0;
    precio_compra=0;
    cliente=0;
    actual=new Finanzas(1.16);
    }
   
    GestionaCompras(int a, double b){
    cantidad_productos=a;
    precio_compra=b;
    cliente=0;
    actual=new Finanzas(1.16);
    }
    
    
    public void leerCompra(){
    System.out.println("Cantidad de productos: ");
        cantidad_productos=scan.nextInt();
    
    System.out.println("Coste total: ");
        precio_compra=scan.nextDouble();
        
        numClientes++;
        cliente=numClientes;
    }
    
    public double aplicaDescuento(double descuento){
    return precio_compra+=descuento;
    //precio_compra=(precio_compra*des)/100;
    }
    
    public void printResumen(){
    System.out.println("Cantidad :" + cantidad_productos + "Precio :" + precio_compra);
    System.out.println("Clientes :" + cliente);
    System.out.println("El precio en dólares es :" + compraInternacional());
    }
    
    public int getNumclientes(){
    return numClientes;
    }
    
    public double compraInternacional(){
    return actual.eurostoDolares(precio_compra);
        
    }
    
    public void deshacerCompra(){
    cantidad_productos=0;
    precio_compra=0;
    numClientes--;
    cliente=0;
    }
    
    
}
