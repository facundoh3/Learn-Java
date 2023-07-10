/*
 Realizar un programa que rellene un matriz de 4 x 4 de valores aleatorios y muestre la
    traspuesta de la matriz. La matriz traspuesta de una matriz A se denota por B y se obtiene
    cambiando sus filas por columnas (o viceversa).
 */
package com.mycompany.ejercicio;

import java.util.Random;

/**
 *
 * @author Facundo
 */
public class App {

    public static void main(String[] args) {
        Random numeroRandom = new Random();
        int filas = 4;
        int columnas = 4;
        int[][] matriz = new int[filas][columnas];
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                matriz[i][j] = numeroRandom.nextInt(10);
            }
        }
        System.out.println("Matriz comun :");
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
//                System.out.println("posfilas[" + i + "] " + " poscolumna [" + j + "]");

                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("--------------------------------------------------");
        System.out.println("Matriz transpuesta");
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print(matriz[j][i] + " ");
            }
            System.out.println();
        }
    }
}
