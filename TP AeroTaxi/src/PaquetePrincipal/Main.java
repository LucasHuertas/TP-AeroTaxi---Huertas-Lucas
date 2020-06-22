package PaquetePrincipal;

import java.awt.*;
import java.awt.event.InputEvent;
import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static PrintStream salida = System.out;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Aerolinea miAerolinea = new Aerolinea();
        Login login = new Login();

        ArrayList<Usuario> usuarios = new ArrayList<>();
        ArrayList<Avion> aviones = new ArrayList<>();
        ArrayList<Vuelo> vuelos = new ArrayList<>();
        File fileU = new File("Usuarios.dat");
        File fileA = new File("Aviones.dat");
        File fileV = new File("Vuelos.dat");

        boolean menu = true;
        Menu.menuTitle();

        while(menu)
        {
            int opcion;
            Menu.menuPrincipal();

            salida.println("\nIngrese una opcion: ");
            opcion = scanner.nextInt();

            switch (opcion)
            {
                case 0:
                    salida.println("\nCerrando el programa. Gracias por utilizar AeroTaxi! ");
                    menu = false;
                    break;
                case 1:
                    // ----------------- Iniciar sesion ---------------------//
                    boolean accede;
                    int opcion2;

                    accede = login.iniciarSesion(fileU);
                    pause();

                    while(accede) {

                        Menu.menuUsuario();
                        salida.println("\nIngrese una opcion: ");
                        opcion2 = scanner.nextInt();

                        switch (opcion2) {
                            case 0:
                                salida.println("\nCerrando sesion. Volviendo al menu principal... ");
                                accede = false;
                                pause();
                                break;
                            case 1:
                                break;
                            case 2:
                                break;
                            case 3:
                                break;
                            default:
                                salida.println("\nNo existe esa opcion. Intente nuevamente. ");
                                break;
                        }
                    }

                    // ------------------------------------------------------//
                    break;
                case 2:
                    // Registrarse
                    login.registrarNuevoUsuario(fileU);
                    pause();
                    break;
                case 3:
                    // Solo administradores
                    salida.println("\nInfo de los archivos: ");
                    salida.println("Archivo de usuarios registrados: \n");
                    ManejoArchivos.mostrarArchivo(fileU);
                    pause();
                    break;
                default:
                    salida.println("\nNo existe esa opcion. Intente nuevamente. ");
                    break;
            }
        }

    }

    public static void pause(){
        Scanner detener = new Scanner(System.in);
        String pausa;
        salida.println("\nPresione ENTER para continuar... ");
        pausa = detener.nextLine();
    }

}




