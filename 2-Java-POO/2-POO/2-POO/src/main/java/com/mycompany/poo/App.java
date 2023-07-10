/*
 * Declarar una clase llamada Circunferencia que tenga como atributo privado el radio de
    tipo real. A continuación, se deben crear los siguientes métodos:
    a) Método constructor que inicialice el radio pasado como parámetro.
    b) Métodos get y set para el atributo radio de la clase Circunferencia.
    c) Método para crearCircunferencia(): que le pide el radio y lo guarda en el atributo del
    objeto.
    d) Método area(): para calcular el área de la circunferencia (Area = pi *radio2).
    e) Método perimetro(): para calcular el perímetro (Perimetro = 2*pi*radio).
 */

package com.mycompany.poo;

/**
 *
 * @author Facundo
 */
public class App {

    public static void main(String[] args) {
        Circunferencia cir = new Circunferencia();
        cir.crearCircunferencia(5.4);
        System.out.println(cir.getRadio());
        System.out.println(cir.area());
        System.out.println(cir.perimetro());
        
        System.out.println("--------------------------------------");
        
        cir.setRadio(6.4);
        System.out.println(cir.getRadio());
        System.out.println(cir.area());
        System.out.println(cir.perimetro());
        
    }
}
