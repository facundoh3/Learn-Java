/*
 * Se necesita una aplicación para una tienda en la cual queremos almacenar los distintos
    productos que venderemos y el precio que tendrán. Además, se necesita que la
    aplicación cuente con las funciones básicas.
    Estas las realizaremos en el servicio. Como, introducir un elemento, modificar su precio,
    eliminar un producto y mostrar los productos que tenemos con su precio (Utilizar
    Hashmap). El HashMap tendrá de llave el nombre del producto y de valor el precio.
    Realizar un menú para lograr todas las acciones previamente mencionadas.
    
    

 */
package com.mycompany.coll;

import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Facundo
 */
public class TiendaService {

    private Tienda tienda;
    private Scanner read;
    private Map<String, Integer> inventario;

    public TiendaService() {
        this.read = new Scanner(System.in);
        this.tienda = new Tienda();
        this.inventario = new HashMap<>();
    }
    //Introduzo nombre y precio
    public void introducirProducto() {
        boolean confirmacion = true;
        inventario = new HashMap<>();
        do {
            
            System.out.println("Mete nombre del producto");
            String nombre = read.next();
            
            
            System.out.println("Mete el precio");
            int precio = read.nextInt();
            
            
            inventario.put(nombre, precio);
            tienda.setProductos(inventario);

            System.out.println("Desea agregar mas productos ? Y/N");
            confirmacion = !read.next().equalsIgnoreCase("Y");
        } while (confirmacion == false);
    }
    //Modificar precio
    public void modificarPrecio(){
         System.out.println("Nombre del producto que queres modificar");
         String nombreProducto = read.next();
         if (inventario.containsKey(nombreProducto)) {
             
             System.out.println("Ingresa el valor del producto que queres modificar");
             int valor = read.nextInt();
             inventario.put(nombreProducto, valor);
             System.out.println("Valor cambiado exitosamente");
             
        }else{
             System.out.println("No existe el nombre en la lista");
         }
    }
    
    public void verListaPrecios(){
        for (Map.Entry<String, Integer> entry : inventario.entrySet()) {
            Object key = entry.getKey();
            Object val = entry.getValue();
            System.out.println("nombre del producto :"+ key);
            System.out.println("Precio del producto :"+ val);
        }
        System.out.println("-------------------------------------------------");
    }
}
