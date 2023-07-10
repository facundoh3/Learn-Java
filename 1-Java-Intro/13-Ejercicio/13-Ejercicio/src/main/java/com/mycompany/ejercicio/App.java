package com.mycompany.ejercicio;

/**
 * @author Facundo Dibujar un cuadrado de N elementos por lado utilizando el
 * carácter “*”. Por ejemplo, si el cuadrado tiene 4 elementos por lado se
 * deberá dibujar lo siguiente: * * * * * * * *
 */
public class App {

    public static void main(String[] args) {
        int filas = 4;
        int columnas = 4;

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                if (i == 0 || i == filas - 1 || j==0 || j==columnas -1) {
                    System.out.print("f");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }
}
