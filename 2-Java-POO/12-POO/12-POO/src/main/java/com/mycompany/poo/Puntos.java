/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.poo;

/**
 *
 * @author Facundo
 */
public class Puntos {

    private double x1;
    private double y1;
    private double x2;
    private double y2;

    public void crearPuntos(double x1, double y1, double x2, double y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }
    
   public double calcularPuntos(){
       return Math.sqrt(Math.pow(x2 , x1) + Math.pow(y1, y2));
   }

}
