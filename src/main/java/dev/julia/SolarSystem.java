package dev.julia;
   


 public class SolarSystem {
    private String name;
    private int satelliteCount;
    private double mass;
    private double volume;
    private int diameter;
    private int averageDistanceToSun;
    private PlanetType type;
    private boolean visibleToNakedEye;

    public enum PlanetType {
        GAS_GIANT, TERRESTRIAL, DWARF
    }

 
    public SolarSystem(String name, int satelliteCount, double mass, double volume, int diameter, int averageDistanceToSun, PlanetType type, boolean visibleToNakedEye) {
        this.name = name;
        this.satelliteCount = satelliteCount;
        this.mass = mass;
        this.volume = volume;
        this.diameter = diameter;
        this.averageDistanceToSun = averageDistanceToSun;
        this.type = type;
        this.visibleToNakedEye = visibleToNakedEye;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSatelliteCount() {
        return satelliteCount;
    }

    public void setSatelliteCount(int satelliteCount) {
        this.satelliteCount = satelliteCount;
    }

    public double getMass() {
        return mass;
    }

    public void setMass(double mass) {
        this.mass = mass;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public int getDiameter() {
        return diameter;
    }

    public void setDiameter(int diameter) {
        this.diameter = diameter;
    }

    public int getAverageDistanceToSun() {
        return averageDistanceToSun;
    }

    public void setAverageDistanceToSun(int averageDistanceToSun) {
        this.averageDistanceToSun = averageDistanceToSun;
    }

    public PlanetType getType() {
        return type;
    }

    public void setType(PlanetType type) {
        this.type = type;
    }

    public boolean isVisibleToNakedEye() {
        return visibleToNakedEye;
    }

    public void setVisibleToNakedEye(boolean visibleToNakedEye) {
        this.visibleToNakedEye = visibleToNakedEye;
    }


 }