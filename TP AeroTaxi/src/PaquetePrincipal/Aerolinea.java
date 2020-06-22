package PaquetePrincipal;

import java.util.ArrayList;

public class Aerolinea {

    private ArrayList<Usuario> usuarios;
    private ArrayList<Avion> aviones;
    private ArrayList<Vuelo> vuelos;

    public Aerolinea(){
        this.usuarios = new ArrayList<>();
        this.aviones = new ArrayList<>();
        this.vuelos = new ArrayList<>();
    }

    public Aerolinea(ArrayList<Usuario> usuarios, ArrayList<Avion> aviones, ArrayList<Vuelo> vuelos){
        this.usuarios = usuarios;
        this.aviones = aviones;
        this.vuelos = vuelos;
    }

    public ArrayList<Usuario> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(ArrayList<Usuario> usuarios) {
        this.usuarios = usuarios;
    }

    public ArrayList<Avion> getAviones() {
        return aviones;
    }

    public void setAviones(ArrayList<Avion> aviones) {
        this.aviones = aviones;
    }

    public ArrayList<Vuelo> getVuelos() {
        return vuelos;
    }

    public void setVuelos(ArrayList<Vuelo> vuelos) {
        this.vuelos = vuelos;
    }

    public void mostrarAviones(){
        for (Avion avion : aviones){
            System.out.println(avion);
        }
    }

    public void mostrarUsuariosRegistrados(){
        for (Usuario user : usuarios){
            System.out.println(user);
        }
    }
}
