package dev.julia;

public class App {
    public static void main(String[] args) {
       
        Planet jupiter = new Planet("Jupiter", 79, 1.898E27, 1.43128E15, 139820, 778, Planet.PlanetType.GAS_GIANT, true);
        Planet mars = new Planet("Mars", 2, 6.4171E23, 1.6318E11, 6779, 228, Planet.PlanetType.TERRESTRIAL, true);

       
        System.out.println(jupiter);
        System.out.println("Density of Jupiter: " + jupiter.calculateDensity());
        System.out.println("Is Jupiter an outer planet: " + jupiter.isOuterPlanet());

        System.out.println(mars);
        System.out.println("Density of Mars: " + mars.calculateDensity());
        System.out.println("Is Mars an outer planet: " + mars.isOuterPlanet());
    }
}
