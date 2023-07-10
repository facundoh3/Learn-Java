/*
 * Crear una clase llamada Libro que contenga los siguientes atributos: ISBN, Título, Autor,
    Número de páginas, y un constructor con todos los atributos pasados por parámetro y un
    constructor vacío. Crear un método para cargar un libro pidiendo los datos al usuario y
    luego informar mediante otro método el número de ISBN, el título, el autor del libro y el
    numero de páginas.
 */
package com.mycompany.poo;

import java.util.Scanner;

/**
 *
 * @author Facundo
 */
public class Libro {

    private long isbn;
    private String titulo;
    private String autor;
    private int paginas;

    public Libro() {
    }

    public Libro(long isbn, String titulo, String autor, int paginas) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
        this.paginas = paginas;
    }

    private String informar() {
        return """
               Libro ingresado por el usuario :
               ISBN : """ + isbn
                + " TITULO : " + titulo
                + " AUTOR : " + autor
                + " PAGINAS : " + paginas;
    }

    public void cargarLibro() {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el isbn");
        Long isbn = leer.nextLong();
        System.out.println("Ingrese el titulo del libro");
        String titulo = leer.next();
        System.out.println("Ingrese el autor ");
        String autor = leer.next();
        System.out.println("Ingrese la cantidad de paginas");
        int paginas = leer.nextInt();
        Libro libroUsuario = new Libro(isbn,titulo,autor,paginas);
        System.out.println(libroUsuario.informar());
        
        
    }
}
