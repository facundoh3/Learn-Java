
package com.mycompany.ejercicio;

import java.util.Scanner;

/**
 * @author Facundo
 * Dada una cantidad de grados centígrados se debe mostrar su equivalente en grados
    Fahrenheit. La fórmula correspondiente es: F = 32 + (9 * C / 5).
 */
public class App {

    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        int F;
        int C;
        System.out.println("Ingrese la cantidad de grados que quiere");
        C = leer.nextInt();
        F=32 + (9 * C /5);
        System.out.println("De grados a Farenheit es :" + F);
    }
}
