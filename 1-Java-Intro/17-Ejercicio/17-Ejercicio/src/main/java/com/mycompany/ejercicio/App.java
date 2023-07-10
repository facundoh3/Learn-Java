/*
 * Recorrer un vector de N enteros contabilizando cuántos números son de 1 dígito, cuántos
    de 2 dígitos, etcétera (hasta 5 dígitos).
 */

package com.mycompany.ejercicio;

import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author Facundo
 */
public class App {

    public static void main(String[] args) {
        Random numerosRandom = new Random();
        int[] vector = new int[5];
        int[] acumuladorDeDigitos = new int[5];
        
        for (int i = 0; i < vector.length; i++) {
            vector[i]=numerosRandom.nextInt(100);
           int a =String.valueOf(vector[i]).length();
            if (a <= 5) {
                acumuladorDeDigitos[i]=a;
            }
           
        }
        System.out.println(Arrays.toString(vector));
        System.out.println(Arrays.toString(acumuladorDeDigitos));
    }
}
