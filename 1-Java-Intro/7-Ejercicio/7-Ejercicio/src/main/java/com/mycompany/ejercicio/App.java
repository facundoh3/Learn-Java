
package com.mycompany.ejercicio;

import java.util.Scanner;

/**
 * @author Facundo
 * Crear un programa que pida una frase y si esa frase es igual a “eureka” el programa
    pondrá un mensaje de Correcto, sino mostrará un mensaje de Incorrecto. Nota: investigar
    la función equals() en Java.
 */
public class App {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la frase si es igual a eureka");
        String palabra=leer.next();
        
        if (!palabra.equals("eureka")) {
            System.out.println("La palabra eureka esta incorrecta");
        }else{
            System.out.println("La palabra eureka esta correcta");
        }
        
    }
}
