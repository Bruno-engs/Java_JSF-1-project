
package br.com.bean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class Calculadora {
    
   private double valor1=0.00;
   private double valor2=0.00;
   private double resultado=0.00;
   
    public double getValor1() {
        return valor1;
    }

    public void setValor1(double valor1) {
        this.valor1 = valor1;
    }

    public double getValor2() {
        return valor2;
    }

    public void setValor2(double valor2) {
        this.valor2 = valor2;
    }

    public double getResultado() {
        return resultado;
    }

    public void setResultado(double resultado) {
        this.resultado = resultado;
    }
   public void somar(){
        resultado = getValor1()+getValor2();
        setValor1(0.0);
        setValor2(0.0);
    }
    
}
