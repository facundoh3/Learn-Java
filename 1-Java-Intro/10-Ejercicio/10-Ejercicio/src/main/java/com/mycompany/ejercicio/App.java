

package com.mycompany.ejercicio;

import java.util.Scanner;

/**
 *
 * @author Facundo
 */
public class App {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingresa el limite a donde quiere llegar ");
        int limiteSuperior=leer.nextInt();        
        int a=0;
        int numUsuario;
        
        while (a < limiteSuperior) {            
            System.out.println("Ingrese un numero ");
            numUsuario = leer.nextInt();
            a+=numUsuario;
            System.out.println(a);
        }
    }
}
