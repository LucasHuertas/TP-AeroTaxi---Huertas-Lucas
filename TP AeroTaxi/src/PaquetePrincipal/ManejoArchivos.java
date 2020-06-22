package PaquetePrincipal;

import com.sun.org.apache.xpath.internal.objects.XObject;

import java.io.*;
import java.util.ArrayList;

public class ManejoArchivos {

    public ManejoArchivos(){}

    public static void cargarElemento(Object obj, File file) {

        boolean existe = file.exists();

        try {
            FileOutputStream fwriter = new FileOutputStream(file, existe);
            MyObjectOutputStream fObj = new MyObjectOutputStream(fwriter, existe);
            fObj.writeObject(obj);

        } catch (EOFException ex) {
            System.out.println("\nFin del fichero. ");
        } catch (IOException ex) {
            System.out.println("Error 1: ");
            ex.printStackTrace();
        }
    }

    public static void mostrarArchivo(File file) {

        Object aux;
        String nombreDelArchivo = file.getName();

        try {
            FileInputStream fReader = new FileInputStream(nombreDelArchivo);
            ObjectInputStream fobj = new ObjectInputStream(fReader);
            aux = fobj.readObject();

            while (aux != null) {
                System.out.println(aux.toString());
                aux = fobj.readObject();
            }
            fobj.close();

        } catch (ClassNotFoundException ex) {
            System.out.println("Error 2: ");
            ex.printStackTrace();
        } catch (IOException ex) {
            //-
        }
    }

    public static void archivoToArraylist(ArrayList<Object> objs, File file){
    }
}
