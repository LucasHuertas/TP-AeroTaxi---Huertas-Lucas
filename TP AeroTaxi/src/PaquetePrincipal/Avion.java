package PaquetePrincipal;

public abstract class Avion {

    protected int capConbustible;
    protected float costoKm;
    protected int capPasajeros;
    protected int velocidadMax;
    protected String propulsion;

    public Avion(int capConbustible, float costoKm, int capPasajeros, int velocidadMax, String propulsion){
        this.capConbustible = capConbustible;
        this.costoKm = costoKm;
        this.capPasajeros = capPasajeros;
        this.velocidadMax = velocidadMax;
        this.propulsion = propulsion;
    }

    public int getCapConbustible() {
        return capConbustible;
    }

    public void setCapConbustible(int capConbustible) {
        this.capConbustible = capConbustible;
    }

    public float getCostoKm() {
        return costoKm;
    }

    public void setCostoKm(float costoKm) {
        this.costoKm = costoKm;
    }

    public int getCapPasajeros() {
        return capPasajeros;
    }

    public void setCapPasajeros(int capPasajeros) {
        this.capPasajeros = capPasajeros;
    }

    public int getVelocidadMax() {
        return velocidadMax;
    }

    public void setVelocidadMax(int velocidadMax) {
        this.velocidadMax = velocidadMax;
    }

    public String getPropulsion() {
        return propulsion;
    }

    public void setPropulsion(String propulsion) {
        this.propulsion = propulsion;
    }

    @Override
    public String toString() {
        return "----------------------------------------" +
                "\nCapacidad de conbustible: " + capConbustible +
                "\nCosto por kilometro: " + costoKm +
                "\nCapacidad de pasajeros: " + capPasajeros +
                "\nVelocidad maxima: " + velocidadMax +
                "\nPropulsion: " + propulsion +
                "\n----------------------------------------";
    }
}
