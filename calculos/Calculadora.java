package calculos;


class Calculadora {

private double n1,n2;
private static int contador_operaciones=0;

public void setN1(double n){
    n1=n;
}
public void setN2(double n){
    n2=n;
}

public double resta(){
    contador_operaciones++;
    double resultado=n1-n2;
    return resultado;
}
public double suma(){
    contador_operaciones++;
    double resultado=n1+n2;
    return resultado;
}
public double multiplicacion(){
    contador_operaciones++;
    double resultado=n1*n2;
    return resultado;
}
public double division(){
    contador_operaciones++;
    double resultado=n1/n2;
    return resultado;
}

public double getN1(){
    return n1;
}
public double getN2(){
    return n2;
}

public void printN1(){
   System.out.println(n1);
    
}
public void printN2(){
   System.out.println(n2);
}

public int getContador(){
return contador_operaciones;
}

}


