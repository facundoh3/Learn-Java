/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.coll;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Iterator;

/**
 *
 * @author Facundo
 */
public class ServicioAlumno {
    private Scanner read;
    private Alumno alumno;
    private List<Alumno> listaAlumnos;
    private List<Integer> notas;
    
    public ServicioAlumno(){
        this.read = new Scanner(System.in);
        this.alumno = new Alumno();
        this.listaAlumnos = new ArrayList();
        this.notas = new ArrayList();
    }

    public void crearAlumno() {
        boolean confirmacion = true;
        do {
            alumno = new Alumno();
            notas = new ArrayList();
            System.out.println("Ingrese el nombre del alumno");
            alumno.setNombre(read.next());
            
            for (int i = 0; i < 3; i++) {
                System.out.println("Ingresa las 3 notas");
                notas.add(read.nextInt());
            }
            alumno.setNotas(notas);
            listaAlumnos.add(alumno);
            System.out.println("Desea cargar otro alumno ? Y/N");
            String usuario =read.next();
            confirmacion = !usuario.equalsIgnoreCase("Y");

        } while (confirmacion == false);
    }
    public void existeAlumno(){
        System.out.println("Ingrese el nombre del alumno cuyo promedio final quiera averiguar");
        String nombreAlumno = read.next();
        boolean encontrado = true;
        for (Alumno alumno : listaAlumnos) {
            if (alumno.getNombre().equalsIgnoreCase(nombreAlumno)) {
                System.out.println("El alumno esta en la lista");
                notaFinal();
            }else{
                encontrado = false;
            }
        }
        if (!encontrado) {
            System.out.println("No se encontro el alumno");
        }
    }
    public double notaFinal(){
        double promedio = 0;
        double calcul = 0;
        for (int notasAlumno : notas) {
            promedio += notasAlumno;
        }
        calcul = promedio /3 ;
        System.out.println("El promedio es de "+ calcul);
        return  calcul;
    }
}
