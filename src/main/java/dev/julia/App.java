package dev.julia;


public class App {
    public static void main(String[] args) {
        // Creación de dos planetas
        SolarSystem jupiter = new SolarSystem("Júpiter", 79, 1.898E27, 1.43128E15, 139820, 778, SolarSystem.TipoPlaneta.GASEOSO, true);
        SolarSystem marte = new SolarSystem("Marte", 2, 6.4171E23, 1.6318E11, 6779, 228, SolarSystem.TipoPlaneta.TERRESTRE, true);

        // Mostrar los valores de los atributos
        System.out.println(jupiter);
        System.out.println("Densidad de Júpiter: " + jupiter.calcularDensidad());
        System.out.println("Júpiter es un planeta exterior: " + jupiter.esPlanetaExterior());

        System.out.println(marte);
        System.out.println("Densidad de Marte: " + marte.calcularDensidad());
        System.out.println("Marte es un planeta exterior: " + marte.esPlanetaExterior());
    }
}
