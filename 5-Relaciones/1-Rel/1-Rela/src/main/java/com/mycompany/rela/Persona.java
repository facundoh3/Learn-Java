/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.rela;



/**
 *
 * @author Facundo
 */
public class Persona {
    private String nombre;
    private String apellido;
    private int edad;
    private long documento;
    private Perro perro;

    public Persona(String nombre, String apellido, int edad, long documento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.documento = documento;
    }
    
    public void adoptarDog(Perro perro){
        this.perro = perro;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + ", documento=" + documento + perro + '}';
    }
    
    
    
}
