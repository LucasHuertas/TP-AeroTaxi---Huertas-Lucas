package PaquetePrincipal;

public class Silver extends Avion{

    private boolean catering;

    public Silver(int capConbustible, float costoKm, int capPasajeros, int velocidadMax, String propulsion, boolean catering){
        super(capConbustible, costoKm, capPasajeros, velocidadMax, propulsion);
        this.catering = catering;
    }
}
