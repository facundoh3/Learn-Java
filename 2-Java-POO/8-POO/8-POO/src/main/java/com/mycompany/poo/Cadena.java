/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.poo;

/**
 *
 * @author Facundo
 */
public class Cadena {

    private String frase;
    private int longitud;

    public Cadena(String frase) {
        this.frase = frase;
    }

    public int longitud() {
        //No entiendo porque acepto a hacer esto 
        int a = this.longitud = frase.length();
       
        return a;
    }

    public int mostrarVocales() {
        int contador = 0;

        for (int i = 0; i < frase.length(); i++) {
            if (frase.contains("a") || frase.contains("e") || frase.contains("i") || frase.contains("o") || frase.contains("u")) {
                return contador += 1;
            }
        }
        return 0;
    }

    public void invertirFrase() {
        for (int i = frase.length() - 1; i >= 0; i--) {
            char fraseCortada = frase.charAt(i);
            System.out.print(fraseCortada);
        }
    }

    public int vecesRepetido(String letra) {
        int contador = 0;
        for (int i = 0; i < frase.length(); i++) {
            if (frase.contains(letra)) {
                contador += 1;
            }
        }
        System.out.println("Se encontro la letra " + letra + " un numero de " + contador + " veces");
        return contador;
    }

    public void compararLongitud(String fraseUsuario) {
        System.out.println("La frase original tiene un total de " + frase.length());
        System.out.println("La frase introducida del usuario tiene " + fraseUsuario.length());
    }

    public void unirFrases(String fraseUsuario) {
        System.out.println("Frases unidas " + frase.concat(fraseUsuario));
    }

    public void reemplazar(String letra) {
        System.out.println("La frase ingresada " + frase);
        System.out.println("Todas las A en la frase se reemplazaran por" + letra);
        String cadenaNueva = frase.replace("a", letra);
        System.out.println("Frase nueva " + cadenaNueva);
    }

    public boolean contiene(String letra) {
        return frase.contains(letra);
    }
}
