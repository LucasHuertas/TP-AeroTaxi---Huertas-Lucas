package PaquetePrincipal;

public class Gold extends Avion{

    private boolean catering;
    private boolean wifi;

    public Gold(int capConbustible, float costoKm, int capPasajeros, int velocidadMax, String propulsion, boolean catering, boolean wifi){
        super(capConbustible, costoKm, capPasajeros, velocidadMax, propulsion);
        this.catering = catering;
        this.wifi = wifi;
    }
}
