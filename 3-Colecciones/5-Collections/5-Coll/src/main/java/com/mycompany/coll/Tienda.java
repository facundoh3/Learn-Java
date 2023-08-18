/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.coll;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Facundo
 */
public class Tienda {
    private String nombreProducto;
    private int precioProducto;
    private Map<String,Integer> productos;
    
    public Tienda(){
        this.nombreProducto = nombreProducto;
        this.precioProducto = precioProducto;
        this.productos = new HashMap<>();
    }

    public Map<String, Integer> getProductos() {
        return productos;
    }

    public void setProductos(Map<String, Integer> productos) {
        this.productos = productos;
    }
    
     @Override
    public String toString() {
        return "Tienda{" + "nombreProducto=" + nombreProducto + ", precioProducto=" + precioProducto + ", productos=" + productos + '}';
    }
}
