package PaquetePrincipal;

import java.io.*;
import java.util.Scanner;

public class Main {

    public static PrintStream salida = System.out;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Usuario nuevo = new Usuario("Lucas", "Huertas", 37399574, 27);
        Usuario nuevo2 = new Usuario("Jose", "Casella", 37399570, 26);
        Usuario nuevo3 = new Usuario("Sharon", "Zeballos", 37399572, 23);
        Login login = new Login();
        File fileU = new File("Usuarios.dat");
        File fileA = new File("Aviones.dat");
        File fileV = new File("Vuelos.dat");

        ManejoArchivos manejador = new ManejoArchivos();

        int menu = 1;
        menuPrincipal();

        while(menu != 0)
        {
            menu = scanner.nextInt();

            switch (menu)
            {
                case 0:
                    salida.println("\nCerrando el programa... ");
                    break;
                case 1:
                    manejador.cargarElemento(nuevo, fileU);
                    manejador.mostrarArchivo(fileU);
                    break;
                case 2:
                    manejador.cargarElemento(login.registrarUsuario(), fileU);
                    break;
                case 3:
                    break;
                default:
                    salida.println("\nNo existe esa opcion. Intente nuevamente. ");
                    break;
            }
        }
    }

    public static void menuPrincipal(){
        salida.println("\n");
        salida.println(" ******************************************** ");
        salida.println(" **************** AERO TAXI ***************** ");
        salida.println(" ******************************************** ");
        salida.println("\n");
        salida.println("\n");
        salida.println("\n1- Iniciar Sesion ");
        salida.println("\n2- Registrarse ");
        salida.println("\n3- Solo Administradores ");

        salida.println("\n\nElija una opcion: ");
    }

    public static void menuRegistro(){
        salida.println("\n");
        salida.println(" ******************************************** ");
        salida.println(" **************** AERO TAXI ***************** ");
        salida.println(" ******************************************** ");
        salida.println("\n");
        salida.println("\n");
        salida.println("\n1- Escribir en archivo ");
        salida.println("\n2- Guardar en archivo ");

        salida.println("\n\nElija una opcion: ");
    }
    
}




