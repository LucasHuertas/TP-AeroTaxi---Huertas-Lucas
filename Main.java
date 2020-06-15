package PaquetePrincipal;

import java.io.PrintStream;
import java.util.Scanner;

public class Main {

    public static PrintStream salida = System.out;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int menu = 1;

        while(menu != 0)
        {
            salida.println("\n");
            salida.println(" ******************************************** ");
            salida.println(" **************** AERO TAXI ***************** ");
            salida.println(" ******************************************** ");
            menuPrincipal();
            menu = scanner.nextInt();

            switch (menu)
            {
                case 0:
                    salida.println("\nCerrando el programa... ");
                    break;
                case 1:
                    salida.println("\nIniciar sesion");
            }
        }
    }

    public static void menuPrincipal(){
        salida.println("\n1- Iniciar Sesion ");
        salida.println("\n2- Registrarse ");
        salida.println("\n3- Solo Administradores ");
    }
}
