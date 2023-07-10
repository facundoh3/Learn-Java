/*
 * Realizar un algoritmo que rellene un vector de tamaño N con valores aleatorios y le pida al
    usuario un numero a buscar en el vector. El programa mostrará donde se encuentra el
    numero y si se encuentra repetido
 */
package com.mycompany.mavenproject1;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Facundo
 */
public class Mavenproject1 {

    public static void main(String[] args) {
        
        Random numeroRandom = new Random();
        Scanner leer = new Scanner(System.in);
        int[] vector = new int[5];
        int contador=0;
        System.out.println("Ingrese que numero quiere buscar entre el 0 y el 10");
        int numeroAbuscar= leer.nextInt();

        for (int i = 0; i < vector.length; i++) {
            vector[i]=numeroRandom.nextInt(10);
        }
        
        for (int i : vector) {
            if (i==numeroAbuscar) {
                System.out.println(i);
                contador+=1;
                System.out.println("El numero fue encontrado "+ contador);
            }
        }
        System.out.println(Arrays.toString(vector));
        contador=0;
    }
}
