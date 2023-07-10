/*
 *Realizar un programa en Java donde se creen dos arreglos: el primero será un arreglo A
    de 50 números reales, y el segundo B, un arreglo de 20 números, también reales. El
    programa deberá inicializar el arreglo A con números aleatorios y mostrarlo por pantalla.
    Luego, el arreglo A se debe ordenar de menor a mayor y copiar los primeros 10 números
    ordenados al arreglo B de 20 elementos, y rellenar los 10 últimos elementos con el valor
    0.5. Mostrar los dos arreglos resultantes: el ordenado de 50 elementos y el combinado de
    20.
 */

package com.mycompany.poo;

import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author Facundo
 */
public class App {

    public static void main(String[] args) {
        double [] arregloA = new double[50];
        double [] arregloB = new double[20];
        Random numRandom = new Random();
        for (int i = 0; i < arregloA.length; i++) {
            arregloA[i]=numRandom.nextDouble()*10;
        }
        
        System.out.println("Arreglo lleno "+Arrays.toString(arregloA));
        Arrays.sort(arregloA);
        //Copia del arreglo a al arreglo b desde la posicion 0 a la 10 
        System.arraycopy(arregloA, 0, arregloB, 0, 10);
        //Llenar el arregloB desde 10 hasta el final con 0.5
        Arrays.fill(arregloB, 10, 20, 0.5);
        System.out.println("ArregloA "+Arrays.toString(arregloA));
        System.out.println("ArregloB "+Arrays.toString(arregloB));
    }
}
