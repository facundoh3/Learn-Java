package com.mycompany.ejercicio;

import java.util.Scanner;

/**
 * @author Facundo
 *
 * Realizar un programa que pida dos números enteros positivos por teclado y
 * muestre por pantalla el siguiente menú: MENU 1. Sumar 2. Restar 3.
 * Multiplicar 4. Dividir 5. Salir Elija opción: El usuario deberá elegir una
 * opción y el programa deberá mostrar el resultado por pantalla y luego volver
 * al menú. El programa deberá ejecutarse hasta que se elija la opción 5. Tener
 * en cuenta que, si el usuario selecciona la opción 5, en vez de salir del
 * programa directamente, se debe mostrar el siguiente mensaje de confirmación:
 * ¿Está seguro que desea salir del programa (S/N)? Si el usuario selecciona el
 * carácter ‘S’ se sale del programa, caso contrario se vuelve a mostrar el
 * menú.
 */
public class App {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String confirmacion = "";
        int resultado;
        int numero2;
        int numero1;

        do {
            System.out.println("Ingrese una opcion\n 1 Suma\n 2 Resta \n 3 Multiplicar \n 4 Dividir \n 5 Salir ");
            int eleccion = leer.nextInt();

            switch (eleccion) {
                case 1:
                    System.out.println("Ingrese los numeros");
                    numero1 = leer.nextInt();
                    numero2 = leer.nextInt();
                    resultado = numero1 + numero2;
                    System.out.println("El resultado es " + resultado);
                    confirmacion = "n";
                    break;
                case 2:
                    System.out.println("Ingrese los numeros");

                    numero1 = leer.nextInt();
                    numero2 = leer.nextInt();
                    resultado = numero1 - numero2;
                    System.out.println("El resultado es " + resultado);
                    confirmacion = "n";

                    break;
                case 3:
                    System.out.println("Ingrese los numeros");

                    numero1 = leer.nextInt();
                    numero2 = leer.nextInt();
                    resultado = numero1 * numero2;
                    System.out.println("El resultado es " + resultado);
                    confirmacion = "n";
                    break;
                case 4:
                    System.out.println("Ingrese los numeros");

                    numero1 = leer.nextInt();
                    numero2 = leer.nextInt();
                    resultado = numero1 / numero2;
                    System.out.println("El resultado es " + resultado);
                    confirmacion = "n";
                    break;
                case 5:
                    System.out.println("Seguro que quiere salir ?");
                    confirmacion = leer.next();
                    break;
                default:
                    throw new AssertionError("Las elecciones deben ser numeros enteros no palabras");
            }
//            System.out.print("\033[H\033[2J");
//            System.out.flush();
        } while (confirmacion.equalsIgnoreCase("N"));
    }
}
