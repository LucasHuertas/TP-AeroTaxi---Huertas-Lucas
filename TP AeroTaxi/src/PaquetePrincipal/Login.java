package PaquetePrincipal;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Scanner;

public class Login {

    public void registrarNuevoUsuario(File file){

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

        ManejoArchivos.cargarElemento(nuevo, file);
        System.out.println("\nHa sido registrado. Use su DNI para acceder.");
    }

    public boolean iniciarSesion(File file) {

        Scanner scanner = new Scanner(System.in);
        int dni = 0;
        boolean accede = false;

        System.out.println("\nBienvenido, ingrese su DNI para ingresar: ");
        dni = scanner.nextInt();

        if (buscarDNI(dni, file) != null) {
            System.out.println("\nHola " + buscarDNI(dni, file) + ", ingresando al sistema... ");
            accede = true;
        }else {
            System.out.println("\nNo existe un usuario registrado con ese DNI. Volviendo al menu principal... ");
        }
        return accede;
    }

    public String buscarDNI(int dni, File file){

        Usuario aux;;
        String nombre = null;

        try{
            FileInputStream fReader = new FileInputStream(file.getName());
            ObjectInputStream fobj = new ObjectInputStream(fReader);
            aux = (Usuario) fobj.readObject();

            while (aux != null) {
                if(dni == aux.getDni())
                    nombre = aux.getNombre();
                aux = (Usuario) fobj.readObject();
            }
            fobj.close();
        } catch (ClassNotFoundException ex) {
            System.out.println("Error 2: ");
            ex.printStackTrace();
        } catch (IOException ex) {
            //-
        }
        return nombre;
    }
}
