package PaquetePrincipal;

import java.util.Scanner;

public class Login {

    public Usuario registrarUsuario(){

        Scanner scanner = new Scanner(System.in);
        Usuario nuevo = new Usuario();

        System.out.println("\nBienvenido, ingrese sus datos para acceder al sistema: ");
        System.out.println("\n-----------------------------------------------------");
        System.out.println("\nNombre: ");
        nuevo.setNombre(scanner.nextLine());
        System.out.println("Apellido: ");
        nuevo.setApellido(scanner.nextLine());
        System.out.println("DNI: ");
        nuevo.setDni(scanner.nextInt());
        System.out.println("Edad: ");
        nuevo.setEdad(scanner.nextInt());
        System.out.println("\n-----------------------------------------------------");

        System.out.println("\nHa sido registrado. Use su DNI para acceder.");

        return nuevo;
    }

    public void iniciarSesion(){

        Scanner scanner = new Scanner(System.in);
        Usuario nuevo = new Usuario();
        int dni = 0;

        System.out.println("\nBienvenido, ingrese su DNI para ingresar: ");


    }

    
}
