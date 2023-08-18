/*
 * Se requiere un programa que lea y guarde países, y para evitar que se ingresen repetidos
usaremos un conjunto. El programa pedirá un país en un bucle, se guardará el país en el
conjunto y después se le preguntará al usuario si quiere guardar otro país o si quiere salir,
si decide salir, se mostrará todos los países guardados en el conjunto. (Recordemos hacer
los servicios en la clase correspondiente)

Después deberemos mostrar el conjunto ordenado alfabéticamente: para esto recordar
cómo se ordena un conjunto.

Por último, al usuario se le pedirá un país y se recorrerá el conjunto con un Iterator, se
buscará el país en el conjunto y si está en el conjunto se eliminará el país que ingresó el
usuario y se mostrará el conjunto. Si el país no se encuentra en el conjunto se le informará
al usuario.
 */
package com.mycompany.coll;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author Facundo
 */
public class App {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        HashSet<String> paises = new HashSet<>();

        String usuario = "";
        boolean confirmacion = true;
        do {
            System.out.println("Agrega un pais pete");
            usuario = read.next();
            paises.add(usuario);
            System.out.println("Desea agregar otro pais a la lista ??");
            confirmacion = !read.next().equalsIgnoreCase("Y");
        } while (confirmacion == false);
        System.out.println("Paises Ingresados : ");
        for (String paise : paises) {
            System.out.println(paise);
        }
        System.out.println("Ingresa el nombre de el pais a eliminar ");
        usuario = read.next();
        Iterator iterator = paises.iterator();
        while (iterator.hasNext()) {
            if (iterator.next().toString().equalsIgnoreCase(usuario)) {
                iterator.remove();
            }
        }
        System.out.println("Lista despues del pais sacado :");
        for (String paise : paises) {
            System.out.println(paise);
        }

    }
}
