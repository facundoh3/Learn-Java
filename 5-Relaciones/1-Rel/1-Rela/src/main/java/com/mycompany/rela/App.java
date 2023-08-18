/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.rela;

/**
 *
 * @author Facundo
 */
public class App {

    public static void main(String[] args) {
        Persona a = new Persona("facundo","herrera",22,42913761);
        Perro b = new Perro("Firulais","Aleman",10,3.5);
        
        a.adoptarDog(b);
        System.out.println(a.toString());
        
    }
}
