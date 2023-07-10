/*
 * Definir una clase llamada Puntos que contendrá las coordenadas de dos puntos, sus
    atributos serán, x1, y1, x2, y2, siendo cada x e y un punto. Generar un objeto puntos
    usando un método crearPuntos() que le pide al usuario los dos números y los ingresa en
    los atributos del objeto. Después, a través de otro método calcular y devolver la distancia
    que existe entre los dos puntos que existen en la clase Puntos. Para conocer como
    calcular la distancia entre dos puntos consulte el siguiente link:
    http://www.matematicatuya.com/GRAFICAecuaciones/S1a.html
 */

package com.mycompany.poo;

import java.util.Scanner;

/**
 *
 * @author Facundo
 */
public class App {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println(" Ingresa el punto numero 1 ");
        double x2=leer.nextDouble();
        double x1=leer.nextDouble();
        System.out.println("Ingresa el punto numero 2");
        double y2=leer.nextDouble();
        double y1=leer.nextDouble();
        
        Puntos a = new Puntos();
        a.crearPuntos(x1, y1, x2, y2);
        System.out.println("La distancia es :"+ a.calcularPuntos());
    }
}
