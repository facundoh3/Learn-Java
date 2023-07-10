
package com.mycompany.ejercicio;

import java.util.Scanner;

/**
 * @author Facundo
 * Crear un programa que dado un numero determine si es par o impar.
 */
public class App {

    public static void main(String[] args) {
        System.out.println("Ingrese si el numero es par o impar ");
        Scanner leer = new Scanner(System.in);
        int respuesta = leer.nextInt();
        
        if ( respuesta % 2 != 0 ) {
            System.out.println("El numero es impar");
        }else{
            System.out.println(" El numero es par ");
        }
        
    }
}
