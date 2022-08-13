package calculos;


public class Temperatura {
    
    public double CelsiusToFarenheit(double n){
        double resultado=0;
        resultado=((9/5)*n)+32;
        return resultado;
    }
 
    public double FarenheitToCelsius(double n){
        //double resultado;
        return (n-32)*0.5;
        //return resultado;
    }
    
}
