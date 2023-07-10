

package com.mycompany.ejercicio;

import java.util.Scanner;

/**
 * @author Facundo
 * Realizar un programa que solo permita introducir solo frases o palabras de 8 de largo. Si el
    usuario ingresa una frase o palabra de 8 de largo se deberá de imprimir un mensaje por
    pantalla que diga “CORRECTO”, en caso contrario, se deberá imprimir “INCORRECTO”.
    Nota: investigar la función Lenght() en Java.
 */
public class App {

    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        System.out.println("Ingrese la palabra solo se permite de 8 largo ");
        String frase= leer.next();
        if (frase.length() != 8) {
            System.out.println("La frase es incorrecta ");
        }else{
            System.out.println("La frase es correcta");
        }
    }
}
