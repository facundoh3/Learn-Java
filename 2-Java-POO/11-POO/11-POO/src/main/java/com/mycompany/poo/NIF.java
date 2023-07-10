
package com.mycompany.poo;

/**
 *
 * @author Facundo
 */
public class NIF {
    private long dni;
    private String identificador;

    public NIF() {
    }

    public void crearNif(long dni){
        this.dni = dni;
    }
    
    public String verificacionDigito(){
        int digito = Math.round(dni % 23);
        String [] letra ={"T","R","W","A","G","M","Y","F","P","D","X","B","N","J","Z","S","Q","V","H","L","C","K","E"}; 
        return letra[digito];   
    }
    public void mostrarDatos(){
        System.out.println("El NIF es "+dni+"-"+verificacionDigito());
    }
    
    
}
