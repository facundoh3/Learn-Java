/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.poo;

/**
 *
 * @author Facundo
 */
public class CuentaBancaria {

    private int numeroCuenta;
    private long dniCliente;
    private int saldoActual = 0;
    private String nombreCliente;

    public CuentaBancaria() {
    }

    public void crearCuenta(String nombreCliente, int numeroCuenta, long dniCliente) {
        this.nombreCliente = nombreCliente;
        this.numeroCuenta = numeroCuenta;
        this.dniCliente = dniCliente;
    }

    public void ingresar(double ingreso) {

        if (ingreso > 0) {
            this.saldoActual += ingreso;
            System.out.println("Tu saldo ahora es de " + saldoActual);
        } else {
            System.out.println("Ingreso erroneo intente nuevamente");

        }

    }

    public void retirar(double retiro) {
        if (retiro < saldoActual) {
            saldoActual -= retiro;
            System.out.println("El retiro fue exitoso su cuenta ahora tiene " + saldoActual);
        } else {
            System.out.println("Su saldo actual es de " + saldoActual);
            System.out.println("Lo que quiere retirar es de " + retiro);
            System.out.println("Por lo cual no es posible continuar con la transaccion");
        }

    }

    public void extraccionRapida(double extraccion) {
        double porcentajeLimite = saldoActual * 0.2;

        if (extraccion <= porcentajeLimite) {
            saldoActual -= extraccion;
            System.out.println("Su saldo ahora es de " + saldoActual);
        } else {
            System.out.println("Intenta sacar mas de el 20% establecido intente de nuevo");

        }
        System.out.println("Su saldo ahora es de " + saldoActual);

    }

    public String consultarSaldo() {
        return "Saldo actual \n " + saldoActual;
    }

    public String consultarDatos() {
        return "Datos del usuario : \n Nombre del cliente : \n" + nombreCliente
                + "\n Numero Cuenta : \n" + numeroCuenta + "\n DNI Cliente : \n" + dniCliente + " \n Saldo Actual : \n" + saldoActual;
    }

}
