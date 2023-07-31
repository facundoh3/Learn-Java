/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.poo;

import java.util.Scanner;

/**
 *
 * @author Facundo
 */
public class Ahorcado {

    private char[] letras;
    private int letrasEncontradas = 0;
    private int vidas = 0;
    private Scanner read;

    public Ahorcado() {
        this.read = new Scanner(System.in);
    }

    /*Se podria crear dinamicamente la generacion de palabras asi no las pone el usuario 
    Por ahora lo voy a dejar asi como lo dice el ejercicio*/
    private void crearJuego() {
        System.out.println("Ingresa la palabra a adivinar");
        String palabra = read.next();
        int dimension = palabra.length();
        letras = new char[dimension];
        letras = palabra.toCharArray();
        System.out.println("Ingresa el numero de jugadas maximas para adivinar la palabra");
        vidas = read.nextInt();
    }

    private void longitud() {
        System.out.println("La palabra tiene " + letras.length + " caracteres");
    }

    private void buscarYEncontrar() {
        boolean[] letrasAdivinadas = new boolean[letras.length];
        do {
            System.out.println("Ingresa una letra para buscar");
            char usuario = read.next().charAt(0);
            boolean encontro = false;

            for (int i = 0; i < letras.length; i++) {
                if (usuario == letras[i]) {
                    letrasEncontradas += 1;
                    encontro = true;
                    letrasAdivinadas[i] = true;
                }
            }
            if (encontro != true) {
                vidas--;
            }
            System.out.println(" ");
            System.out.println("Letras encontradas : " + letrasEncontradas);
            System.out.println(" ");
            System.out.println("Intentos restantes :" + vidas);
            for (int i = 0; i < letras.length; i++) {
                if (letrasAdivinadas[i]) {
                    System.out.print(" " + letras[i]);
                } else {
                    System.out.print(" _");
                }
                
            }
            System.out.println(" ");
            System.out.println("----------------------------------------------------------------------------");
        } while (vidas != 0);

    }

    public void juego() {
        crearJuego();
        longitud();
        buscarYEncontrar();
    }
}
