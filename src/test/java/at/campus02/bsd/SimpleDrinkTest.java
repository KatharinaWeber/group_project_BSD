package at.campus02.bsd;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class SimpleDrinkTest {

    private SimpleDrink simpleDrink;
    private Liquid nonAlcoholicLiquid;
    private Liquid alcoholicLiquid;

    @BeforeEach
    public void setUp() {
        nonAlcoholicLiquid = new Liquid("Water", 0.25, 0.0);
        alcoholicLiquid = new Liquid("Bacardi", 0.5, 12.0);
    }

    @Test
    public void testGetVolume() {
        simpleDrink = new SimpleDrink("Water", nonAlcoholicLiquid);
        assertEquals(0.25, simpleDrink.getVolume());

        simpleDrink = new SimpleDrink("Bacardi", alcoholicLiquid);
        assertEquals(0.5, simpleDrink.getVolume());
    }

    @Test
    public void testGetAlcoholPercent() {
        simpleDrink = new SimpleDrink("Water", nonAlcoholicLiquid);
        assertEquals(0.0, simpleDrink.getAlcoholPercent());

        simpleDrink = new SimpleDrink("Bacardi", alcoholicLiquid);
        assertEquals(12.0, simpleDrink.getAlcoholPercent());
    }

    @Test
    public void testIsAlcoholic() {
        simpleDrink = new SimpleDrink("Water", nonAlcoholicLiquid);
        assertFalse(simpleDrink.isAlcoholic());

        simpleDrink = new SimpleDrink("Bacardi", alcoholicLiquid);
        assertTrue(simpleDrink.isAlcoholic());
    }
}

