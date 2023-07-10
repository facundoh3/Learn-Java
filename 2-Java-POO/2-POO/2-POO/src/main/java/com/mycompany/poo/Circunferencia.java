
package com.mycompany.poo;

/**
 *
 * @author Facundo
 */
public class Circunferencia {
    private double radio;

    public Circunferencia() {
    }

    public Circunferencia(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
    /*
        metodo que pide el radio y lo guarda en el atributo del objeto
    */
    public void crearCircunferencia(double radio){
        this.radio = radio;
    }
    public double area(){
        return Math.PI * radio * radio;
    }
    
    public double perimetro(){
        return 2* Math.PI*radio;
    }
}
