

package com.mycompany.ejercicio;

import java.util.Scanner;

/**
 *
 * @author Facundo
 * Escribir un programa que pida tu nombre, lo guarde en una variable y lo muestre por
    pantalla.
 */
public class App {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in); 
        System.out.println(" Ingrese su nombre ");
        String nombre =leer.next();
        System.out.println("Su nombre es "+ nombre);
    }
}
