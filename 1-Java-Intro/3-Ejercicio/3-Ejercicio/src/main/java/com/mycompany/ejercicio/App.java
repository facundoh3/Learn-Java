

package com.mycompany.ejercicio;

import java.util.Scanner;

/**
 * @author Facundo
 * Escribir un programa que pida una frase y la muestre toda en mayúsculas y después toda
    en minúsculas. Nota: investigar la función toUpperCase() y toLowerCase() en Java.
 */
public class App {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String fraseUsuario;
        System.out.println("Porfavor ingrese una frase para mostrarla en Mayusculas y en minisculas");
        fraseUsuario= leer.next();
        System.out.println("Frase en mayusculas :" +fraseUsuario.toUpperCase());
        System.out.println("Frase en minusculas :" + fraseUsuario.toLowerCase());
        
    }
}
