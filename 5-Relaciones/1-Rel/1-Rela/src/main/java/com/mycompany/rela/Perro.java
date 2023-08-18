/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.rela;

/**
 *
 * @author Facundo
 */
public class Perro {
    private String nombre;
    private String raza;
    private int edad;
    private double tamano;
    
    public Perro(){
    }
    
    public Perro (String nombre, String raza , int edad , double tamano){
        this.nombre = nombre;
        this.raza = raza;
        this.edad = edad;
        this.tamano = tamano;
    }

    @Override
    public String toString() {
        return "Perro{" + "nombre=" + nombre + ", raza=" + raza + ", edad=" + edad + ", tamano=" + tamano + '}';
    }
    
}
