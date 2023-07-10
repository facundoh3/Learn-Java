/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.ejercicio;

import java.util.Scanner;

/**
 *
 * @author Facundo
 */
public class App {

    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
                
        System.out.println("Ingresa 2 numeros enteros ");
        int num1 = leer.nextInt();
        System.out.println("Primer numero ingresado ");
        
        int num2 = leer.nextInt();
        System.out.println("Segundo numero ingresado ");
        int respuesta = num1 + num2;
        System.out.println("La suma es "+ respuesta);
    }
}
