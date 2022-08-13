package calculos;


public class Peso {
    
    private double peso;
    
    Peso(double a){
    peso=a;
    }
    
    public double getLibras(){
        return 0.453*peso;
    }
    public double getOnzas(){
        return getLibras()*peso;
    }
    public double getKilos(){
        return peso;
    }
    public double getGramos(){
        return peso*1000;
    }
    public void printPeso(){
        System.out.println("Peso en libras: " + getLibras());
        System.out.println("Peso en onzas: " + getOnzas());
        System.out.println("Peso en kilos: " + getKilos());
        System.out.println("Peso en gramos: " + getGramos());
    }
}
