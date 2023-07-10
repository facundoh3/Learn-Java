/*
 * Realizar una clase llamada Matemática que tenga como atributos dos números reales con
    los cuales se realizarán diferentes operaciones matemáticas. La clase deber tener un
    constructor vacío, parametrizado y get y set. En el main se creará el objeto y se usará el
    Math.random para generar los dos números y se guardaran en el objeto con su
    respectivos set. Deberá además implementar los siguientes métodos:
    a) Método devolverMayor() para retornar cuál de los dos atributos tiene el mayor valor
    b) Método calcularPotencia() para calcular la potencia del mayor valor de la clase elevado
    al menor número. Previamente se deben redondear ambos valores.
    c) Método calculaRaiz(), para calcular la raíz cuadrada del menor de los dos valores.
    Antes de calcular la raíz cuadrada se debe obtener el valor absoluto del número.
 */

package com.mycompany.poo;

/**
 *
 * @author Facundo
 */
public class App {

    public static void main(String[] args) {
        
        double numero1 = Math.round(Math.random()*10);
        double numero2 = Math.round(Math.random()*10);
        System.out.println("numero 1 "+numero1);
        System.out.println("numero2 "+numero2);
       Matematica s = new Matematica(numero1,numero2);
        System.out.println("Devolviendo el mayor "+Matematica.devolverMayor());
        System.out.println("Calcular raiz y devolver el menor "+Matematica.calcularRaiz());
    }
}
