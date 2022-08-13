package calculos;


public class Finanzas {
    
    private double cambio=1.2;
    
    Finanzas(){
    cambio=1.36;
    
    }
    
    Finanzas(double x){
        cambio=x;
    }
    
    public double dolarestoEuros(double dolares){
    return dolares/cambio;
    }
    
    public double eurostoDolares(double euros){
    return euros*cambio;
    }
}
