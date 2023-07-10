/*
    Realizar un algoritmo que rellene un vector con los 100 primeros números enteros y los
    muestre por pantalla en orden descendente.
 */
package com.mycompany.ejercicio;

/**
 *
 * @author Facundo
 */
public class App {

    public static void main(String[] args) {
        int[] vector = new int[100];
        for (int i = 0; i < vector.length; i++) {
            vector[i]=i + 1;
        }
        
        
        System.out.println("Array lleno");
        System.out.println(vector);
        for (int a = vector.length-1 ; a >= 0 ; a--) {
            System.out.println(vector[a]);
        }
        
        

    }
}
