/*
 * 
 */
package com.mycompany.coll;

/**
 *
 * @author Facundo
 */
public class App {

    public static void main(String[] args) {
        TiendaService tienda = new TiendaService();
        tienda.introducirProducto();
        tienda.verListaPrecios();
        tienda.modificarPrecio();
        tienda.verListaPrecios();
    }
}
