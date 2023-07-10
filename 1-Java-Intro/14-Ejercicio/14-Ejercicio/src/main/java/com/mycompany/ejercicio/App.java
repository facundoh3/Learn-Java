/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.ejercicio;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Facundo Crea una aplicación que a través de una función nos convierta
 * una cantidad de euros introducida por teclado a otra moneda, estas pueden ser
 * a dólares, yenes o libras. La función tendrá como parámetros, la cantidad de
 * euros y la moneda a converir que será una cadena, este no devolverá ningún
 * valor y mostrará un mensaje indicando el cambio (void). El cambio de divisas
 * es: 0.86 libras es un 1 € 1.28611 $ es un 1 € 129.852 yenes es un 1 €
 */
public class App {

    public static void main(String[] args) {
        String[] monedas = {"yenes", "dolares", "libras"};
        double divisa;
        Scanner leer = new Scanner(System.in);
        boolean confirmacion = false;
        /*cambio a euro =  14Libras * 1/ 0.86  */
        System.out.println("Ingrese la moneda a la que quiera cambiar");
        String cambio = leer.next();
        System.out.println("Ingrese la cantidad que desee cambiar");
        divisa = leer.nextFloat();

//        if (!cambio.equalsIgnoreCase("dolares") && !cambio.equalsIgnoreCase("libras") && !cambio.equalsIgnoreCase("yenes")) {
//            System.out.println("LA MONEDA ES INCORRECTA");
//            System.out.println("Ingrese la moneda correcta dolares/libras/yenes");
//            cambio = leer.next();
//        } else {
//            do {
//
//            } while (!cambio.equalsIgnoreCase("dolares") && !cambio.equalsIgnoreCase("libras") && !cambio.equalsIgnoreCase("yenes"));
//            cambioDivisas(cambio);
//        }
        do {
            for (String moneda : monedas) {
                if (cambio.equalsIgnoreCase(moneda)) {
                    cambio.toLowerCase();
                    confirmacion = true;
                    cambioDivisas(cambio, divisa);
                }
                
                if (!confirmacion) {
                    divisa = 0;
                    System.out.println("Moneda incorrecta intente nuevamente");
                    cambio = leer.next();
                    System.out.println("Ingrese cuanto va a ingresar nuevamente");
                    divisa = leer.nextFloat();
                }
                    
            }

        } while (!confirmacion);

    }

    public static void cambioDivisas(String cambio, double divisa) {
        double resultado;
        System.out.println(cambio);
        switch (cambio) {
            case "yenes" -> {
                resultado = divisa * (double) 1 / 0.86;
                System.out.println("pasando de euros a yenes da " + resultado + " yenes");
            }
            case "libras" -> {
                resultado = divisa * (double) 1 / 1.28611;
                System.out.println("pasando de euros a libras da " + resultado + " libras");
            }
            case "dolares" -> {
                resultado = divisa * (double) 1 / 129.852;
                System.out.println("pasando de euros a dolares da " + resultado + " dolares");
            }
            default ->
                throw new AssertionError();
        }
    }
}
