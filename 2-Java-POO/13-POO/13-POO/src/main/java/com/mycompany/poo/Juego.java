/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.poo;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Facundo
 */
public class Juego {

    Random a = new Random();
    Scanner leer = new Scanner(System.in);
    private String mes[] = {"enero", "febrero", "marzo",
        "abril", "mayo", "junio", "julio", "agosto", "septiembre", "octubre", "noviembre", "diciembre"};

    public void adivinarMes() {
        boolean confirmacion;
        String palabra;

        System.out.println("Intenta adivinar el mes secreto");
        System.out.println(Arrays.toString(mes));
        do {
            palabra = leer.next();
            if (palabra.equals(mes[a.nextInt(12) + 1])) {
                System.out.println("Le pegaste !!");
                confirmacion = false;
            } else {
                System.out.println("No le pegaste lo queres intentar de nuevo ? y/n");
                String config = leer.next();
                if (config.equalsIgnoreCase("y")) {
                    confirmacion = true;
                }
            }
        } while (false);
    }
}
