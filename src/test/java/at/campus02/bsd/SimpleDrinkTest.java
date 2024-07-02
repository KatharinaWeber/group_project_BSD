package at.campus02.bsd;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;
/**
 * Class to Test SimpleDrink Class
 */
public class SimpleDrinkTest {

    private SimpleDrink simpleDrink;
    private Liquid nonAlcoholicLiquid;
    private Liquid alcoholicLiquid;
    /**
     * Initializes nonAlcoholicLiquid and alcoholicLiquid before each test.
     */
    @BeforeEach
    public void setUp() {
        nonAlcoholicLiquid = new Liquid("Water", 0.25, 0.0);
        alcoholicLiquid = new Liquid("Bacardi", 0.5, 12.0);
    }
    /**
     * Tests that getVolume() returns the correct volume for different drinks.
     */
    @Test
    public void testGetVolume() {
        simpleDrink = new SimpleDrink("Water", nonAlcoholicLiquid);
        assertEquals(0.25, simpleDrink.getVolume());

        simpleDrink = new SimpleDrink("Bacardi", alcoholicLiquid);
        assertEquals(0.5, simpleDrink.getVolume());
    }
    /**
     * Tests that getAlcoholPercent() returns the correct alcohol percentage for different drinks.
     */
    @Test
    public void testGetAlcoholPercent() {
        simpleDrink = new SimpleDrink("Water", nonAlcoholicLiquid);
        assertEquals(0.0, simpleDrink.getAlcoholPercent());

        simpleDrink = new SimpleDrink("Bacardi", alcoholicLiquid);
        assertEquals(12.0, simpleDrink.getAlcoholPercent());
    }
    /**
     * Tests that isAlcoholic() correctly identifies alcoholic and non-alcoholic drinks.
     */
    @Test
    public void testIsAlcoholic() {
        simpleDrink = new SimpleDrink("Water", nonAlcoholicLiquid);
        assertFalse(simpleDrink.isAlcoholic());

        simpleDrink = new SimpleDrink("Bacardi", alcoholicLiquid);
        assertTrue(simpleDrink.isAlcoholic());
    }
}

