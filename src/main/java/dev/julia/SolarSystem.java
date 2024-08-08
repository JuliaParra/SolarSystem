package dev.julia;

public class SolarSystem {
    private final String nombre;
    private final int cantidadSatelites;
    private final double masa;
    private final double volumen;
    private final int diametro;
    private final int distanciaMediaSol;
    private final TipoPlaneta tipo;
    private final boolean observableSimpleVista;

    // Enumeración para el tipo de planeta
    public enum TipoPlaneta {
        GASEOSO, TERRESTRE, ENANO
    }

    // Constructor
    public SolarSystem(String nombre, int cantidadSatelites, double masa, double volumen, int diametro, int distanciaMediaSol, TipoPlaneta tipo, boolean observableSimpleVista) {
        this.nombre = nombre;
        this.cantidadSatelites = cantidadSatelites;
        this.masa = masa;
        this.volumen = volumen;
        this.diametro = diametro;
        this.distanciaMediaSol = distanciaMediaSol;
        this.tipo = tipo;
        this.observableSimpleVista = observableSimpleVista;
    }

    // Métodos para obtener los valores de los atributos
    public String getNombre() {
        return nombre;
    }

    public int getCantidadSatelites() {
        return cantidadSatelites;
    }

    public double getMasa() {
        return masa;
    }

    public double getVolumen() {
        return volumen;
    }

    public int getDiametro() {
        return diametro;
    }

    public int getDistanciaMediaSol() {
        return distanciaMediaSol;
    }

    public TipoPlaneta getTipo() {
        return tipo;
    }

    public boolean isObservableSimpleVista() {
        return observableSimpleVista;
    }

    // Método para calcular la densidad del planeta
    public double calcularDensidad() {
        return masa / volumen;
    }

    // Método para determinar si el planeta es exterior
    public boolean esPlanetaExterior() {
        double distanciaMediaSolKm = distanciaMediaSol * 1_000_000;
        double distanciaUA = distanciaMediaSolKm / 149_597_870.0;
        return distanciaUA > 3.4;
    }

    @Override
    public String toString() {
        return "Planeta{" +
                "nombre='" + nombre + '\'' +
                ", cantidadSatelites=" + cantidadSatelites +
                ", masa=" + masa +
                ", volumen=" + volumen +
                ", diametro=" + diametro +
                ", distanciaMediaSol=" + distanciaMediaSol +
                ", tipo=" + tipo +
                ", observableSimpleVista=" + observableSimpleVista +
                '}';
    }
}
