/*
    Un cuadrado mágico 3 x 3 es una matriz 3 x 3 formada por números del 1 al 9 donde la
    suma de sus filas, sus columnas y sus diagonales son idénticas. Crear un programa que
    permita introducir un cuadrado por teclado y determine si este cuadrado es mágico o no.
    El programa deberá comprobar que los números introducidos son correctos, es decir,
    están entre el 1 y el 9.
 */
package com.mycompany.ejercicio;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Facundo
 */
public class App {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingresa los numeros del 1 al 9 ");
        int filas = 3;
        int columnas = 3;

        int[][] matriz = new int[filas][columnas];

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.println("Ingresa el numero de la posicion [" + i + "] " + " [" + j + "]");
                int numeroUsuario = leer.nextInt();
                if (numeroUsuario > 1 || numeroUsuario < 9) {
                    matriz[i][j] = numeroUsuario;
                } else {
                    System.out.println("Soy omelo chino");
                }
            }
            System.out.println();
        }
        int sumaColumnas = 0;
        int sumaFilas = 0;
        int sumaDiagonales=0;
        for (int i = 0; i <= 2; i++) {
            sumaFilas += matriz[i][filas-1];

        }
        for (int j = 0; j <= 2; j++) {
            sumaColumnas += matriz[columnas-1][j];
        }
        for (int i = 0; i < matriz.length; i++) {
//            System.out.println(matriz[i][i]);
             sumaDiagonales+=matriz[i][i];
             //sumaDiagonalesReves+=matriz[i][matriz.length - 1 - i];
        }
        System.out.println("La sum columnas :" + sumaColumnas + " La suma de las filas es " + sumaFilas+" La suma de la diagonal es "+sumaDiagonales);
    }
}
