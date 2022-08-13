package calculos;


public class Satelite {
    
    private double meridiano;
    private double paralelo; //Le falta el punto y coma ;
    private double distancia_tierra;
    
    Satelite(double m, double p, double d){ //Este constructor no es correcto porque tiene tilde
        meridiano=m;
        paralelo=p;
        distancia_tierra=d; //El atributo no está bien escrito
    }
   
    Satelite(){ //En este constructor no debería llevar entre paréntesis los double 
        meridiano=paralelo=distancia_tierra=0;
    }
    
    public void setPosicion(int m, int p, double d){
    meridiano=m;
    paralelo=p;
    distancia_tierra=d;
    }
   
    public void printPosicion(){
        System.out.println("El satélite se encuentra en el paralelo "+ paralelo +", meridiano "+ meridiano +" a una distancia de la Tierra de "+ distancia_tierra);
    } //Las comillas no están bien colocadas respecto al texto*/

    public void variaAltura(double desplazamiento){
    distancia_tierra+=desplazamiento;
    }
    
    public boolean enOrbita(){
    return (distancia_tierra>0);
   
    }
    
    public void variaPosicion(double despPar, double despMer){
    paralelo+=despPar;
    meridiano+=despMer;
    }
    }
