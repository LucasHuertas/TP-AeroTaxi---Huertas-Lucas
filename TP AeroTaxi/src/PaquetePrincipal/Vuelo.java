package PaquetePrincipal;

import java.time.LocalDate;

public class Vuelo {

    private Usuario user;
    private LocalDate fecha;
    private String origen;
    private String destino;
    private int cantAcomp;
    private Avion avion;

    public Vuelo(Usuario user, LocalDate fecha, String origen, String destino, int cantAcomp, Avion avion){
        this.user = user;
        this.fecha = fecha;
        this.origen = origen;
        this.destino = destino;
        this.cantAcomp = cantAcomp;
        this.avion = avion;
    }

    public Usuario getUser() {
        return user;
    }

    public void setUser(Usuario user) {
        this.user = user;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public int getCantAcomp() {
        return cantAcomp;
    }

    public void setCantAcomp(int cantAcomp) {
        this.cantAcomp = cantAcomp;
    }

    public Avion getAvion() {
        return avion;
    }

    public void setAvion(Avion avion) {
        this.avion = avion;
    }

    public float calcularCostoTotalVuelo(){
        return 0;
    }
}
