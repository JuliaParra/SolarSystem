package dev.julia;

public class App {
    public static void main(String[] args) {
       
        SolarSystem jupiter = new SolarSystem("Jupiter", 79, 1.898E27, 1.43128E15, 139820, 778, SolarSystem.PlanetType.GAS_GIANT, true);
        SolarSystem mars = new SolarSystem("Mars", 2, 6.4171E23, 1.6318E11, 6779, 228, SolarSystem.PlanetType.TERRESTRIAL, true);

       
        System.out.println(jupiter);
        System.out.println("Density of Jupiter: " + jupiter.calculateDensity());
        System.out.println("Is Jupiter an outer planet: " + jupiter.isOuterPlanet());

        System.out.println(mars);
        System.out.println("Density of Mars: " + mars.calculateDensity());
        System.out.println("Is Mars an outer planet: " + mars.isOuterPlanet());
    }
}
