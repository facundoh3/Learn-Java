/*
 * Realizar una clase llamada Cuenta (bancaria) que debe tener como mínimo los atributos:
    numeroCuenta (entero), el DNI del cliente (entero largo) y el saldo actual (entero). Las
    operaciones asociadas a dicha clase son:
    a) Constructor por defecto y constructor con DNI, saldo, número de cuenta e interés.
    b) Agregar los métodos getters y setters correspondientes
    c) Metodo para crear un objeto Cuenta, pidiéndole los datos al usuario.
    d) Método ingresar(double ingreso): el método recibe una cantidad de dinero a ingresar
    y se la sumara a saldo actual.
    e) Método retirar(double retiro): el método recibe una cantidad de dinero a retirar y se la
    restará al saldo actual. Si la cuenta no tiene la cantidad de dinero a retirar, se pondrá el
    saldo actual en 0.
    f) Método extraccionRapida(): le permitirá sacar solo un 20% de su saldo. Validar que el
    usuario no saque más del 20%.
    g) Método consultarSaldo(): permitirá consultar el saldo disponible en la cuenta.
    h) Método consultarDatos(): permitirá mostrar todos los datos de la cuenta
 */
package com.mycompany.poo;

import java.util.Scanner;

/**
 *
 * @author Facundo
 */
public class App {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        CuentaBancaria cuenta = new CuentaBancaria();
        int opcion = 0;
        while (opcion != 7) {
            System.out.println("------- MENÚ -------");
            System.out.println("1) Crear cuenta");
            System.out.println("2) Ingresar plata");
            System.out.println("3) Retirar plata");
            System.out.println("4) Extracción rápida");
            System.out.println("5) Consultar saldo");
            System.out.println("6) Consultar datos");
            System.out.println("7) Salir");
            System.out.println("Tenga en cuenta que si no crea la cuenta "
                    + "no podra realizar mas acciones");
            System.out.print("Seleccione una opción: ");
            opcion = leer.nextInt();
            switch (opcion) {
                case 1 -> {
                    System.out.println("Ingrese su nombre");
                    String nombreCliente = leer.next();
                    System.out.println("Ingrese su numero de cuenta");
                    int numeroDeCuenta = leer.nextInt();
                    System.out.println("Ingrese su DNI");
                    long dniCliente = leer.nextInt();
                    cuenta.crearCuenta(nombreCliente, numeroDeCuenta, dniCliente);
                }
                case 2 -> {
                    System.out.println("Cuanto desea ingresar ?");
                    cuenta.ingresar(leer.nextInt());
                }
                case 3 -> {
                    System.out.println("Cuanto desea retirar ?");
                    cuenta.retirar(leer.nextInt());
                }
                case 4 -> {
                    System.out.println("Esto solo le permite sacar el 20% de su sueldo");
                    cuenta.extraccionRapida(leer.nextInt());
                }
                case 5 ->{
                    cuenta.consultarSaldo();
                }
                case 6 ->{
                    cuenta.consultarDatos();
                }
                case 7 ->{
                    System.out.println("Hasta Luego !!");
                }
                default ->
                    System.out.println("Opcion incorrecta intente nuevamente");
            }
        }

    }
}
