/*
 * Realizar una clase llamada Matemática que tenga como atributos dos números reales con
los cuales se realizarán diferentes operaciones matemáticas. La clase deber tener un
constructor vacío, parametrizado y get y set. En el main se creará el objeto y se usará el
Math.random para generar los dos números y se guardaran en el objeto con su
respectivos set. Deberá además implementar los siguientes métodos:
a) Método devolverMayor() para retornar cuál de los dos atributos tiene el mayor valor
b) Método calculaRaiz(), para calcular la raíz cuadrada del menor de los dos valores.
Antes de calcular la raíz cuadrada se debe obtener el valor absoluto del número.
 */
package com.mycompany.poo;

/**
 *
 * @author Facundo
 */
public class Matematica {
    private static double num1;
    private static double num2;

    public Matematica(double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
    }   
    
    static double devolverMayor(){
        return Math.max(num1, num2);
    }
    static double calcularRaiz(){
        double valorabs=Math.abs(num1);
        double valorabs2 = Math.abs(num2);
        return Math.min(Math.sqrt(valorabs),Math.sqrt(valorabs2));
    }
}
