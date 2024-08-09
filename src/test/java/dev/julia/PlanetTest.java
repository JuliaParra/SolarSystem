package dev.julia;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

class PlanetTest {

    @Test
    void testCalculateDensity() {
       
        Planet earth = new Planet("Earth", 1, 5.972E24, 1.08321E12, 12742, 149, Planet.PlanetType.TERRESTRIAL, true);
        
        
        double expectedDensity = 5.972E24 / 1.08321E12;
        assertEquals(expectedDensity, earth.calculateDensity(), 0.0001);
    }

    @Test
    void testIsOuterPlanet() {
        
        Planet jupiter = new Planet("Jupiter", 79, 1.898E27, 1.43128E15, 139820, 778, Planet.PlanetType.GAS_GIANT, true);
       
        Planet mars = new Planet("Mars", 2, 6.4171E23, 1.6318E11, 6779, 228, Planet.PlanetType.TERRESTRIAL, true);
        
        
        assertTrue(jupiter.isOuterPlanet());
        assertFalse(mars.isOuterPlanet());
    }

}




