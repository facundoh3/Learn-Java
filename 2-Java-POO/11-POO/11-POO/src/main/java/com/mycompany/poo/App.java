/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.poo;

/**
 *
 * @author Facundo
 */
public class App {

    public static void main(String[] args) {
        
        NIF s = new NIF();
        s.crearNif(42913761);
        s.verificacionDigito();
        s.mostrarDatos();
        
    }
}
