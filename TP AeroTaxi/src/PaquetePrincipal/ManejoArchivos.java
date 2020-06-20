package PaquetePrincipal;

import java.io.*;

public class ManejoArchivos {

    public ManejoArchivos(){}

    public void cargarElemento(Object obj, File file) {

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

    public void mostrarArchivo(File file) {

        Object aux;
        String nombreDelArchivo = file.getName();

        try {
            FileInputStream bn = new FileInputStream(nombreDelArchivo);
            ObjectInputStream fobj = new ObjectInputStream(bn);
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
}