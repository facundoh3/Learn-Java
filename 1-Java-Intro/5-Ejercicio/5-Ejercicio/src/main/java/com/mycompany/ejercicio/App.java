
package com.mycompany.ejercicio;

import java.util.Scanner;

/**
 *
 * @author Facundo
 * Escribir un programa que lea un número entero por teclado y muestre por pantalla el
    doble, el triple y la raíz cuadrada de ese número. Nota: investigar la función Math.sqrt().
 */
public class App {

    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        System.out.println("Ingrese un numero entero este mostrara el doble y el triple y la raiz cuadrada");
        int numentero= leer.nextInt();
        System.out.println("El doble del numero es "+ numentero*2);
        System.out.println("El triple es : "+ numentero*3);
        System.out.println("La raiz cuadrada es "+ Math.sqrt(numentero) );
        
    }
}
