package economics;

import calculos.*;


public class Finanzas {
    
    private double cambio=1.2;
    
    public Finanzas(){
        cambio=1.36;
    }
    
    public Finanzas(double x){
        cambio=x;
    }
    
    public double dolarestoEuros(double dolares){
    return dolares/cambio;
    }
    
    public double eurostoDolares(double euros){
    return euros*cambio;
    }
}
