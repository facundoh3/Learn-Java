/*
 * Diseñar un programa que lea y guarde razas de perros en un ArrayList de tipo String. El
    programa pedirá una raza de perro en un bucle, el mismo se guardará en la lista y
    después se le preguntará al usuario si quiere guardar otro perro o si quiere salir. Si decide
    salir, se mostrará todos los perros guardados en el ArrayList.

    Al usuario se le pedirá un perro y se recorrerá la lista con un Iterator, se buscará el perro en la lista. Si el perro
    está en la lista, se eliminará el perro que ingresó el usuario y se mostrará la lista
    ordenada. Si el perro no se encuentra en la lista, se le informará al usuario y se mostrará
    la lista ordenada.
 */
package com.mycompany.coll;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Facundo
 */
public class App {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        List<String> razas = new ArrayList();
        boolean salir = true;
        String confirmacion;
        String usuario = null;
        String buscar = null;
        do {
            System.out.println("Queres guardar una raza de perro?? Y/N");
            confirmacion = read.next();
            if (confirmacion.equalsIgnoreCase("N")) {
                salir = true;
                System.out.println(razas);
            } else {
                System.out.println("Que raza de perro queres agregar??");
                usuario = read.next();
                razas.add(usuario);
                salir = false;
            }
        } while (salir == false);

        System.out.println("Que perro queres buscar?");
        buscar = read.next();
        Iterator<String> iterador = razas.iterator();

        while (iterador.hasNext()) {
            String nombre = iterador.next();
            if (nombre.equals(buscar)) {
                iterador.remove();
            }
            System.out.println("Al final quedo asi : " + nombre);
        }
    }
}
