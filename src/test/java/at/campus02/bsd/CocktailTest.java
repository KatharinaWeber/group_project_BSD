package at.campus02.bsd;

import org.junit.jupiter.api.*;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Class to Test Cocktail Class
 */
public class CocktailTest {

    private Cocktail cocktail;
    /**
     * Sets up a Cocktail before each test
     */
    @BeforeEach
    public void setCocktail() {
        List<Liquid> liquids = new ArrayList<>();
        liquids.add(new Liquid("White Rum", 0.4, 42));
        liquids.add(new Liquid("Soda Water", 0.5, 0));
        liquids.add(new Liquid("Lime Juice", 0.1, 0));

        cocktail = new Cocktail("Mojito", liquids);
    }
    /**
     * Test if getting the volume of a Cocktail works
     */
    @Test
    public void testGetVolume() {
        assertEquals(1.0, cocktail.getVolume());
    }
    /**
     * Test if getting the alcohol percentage of a Cocktail works
     */
    @Test
    public void testGetAlcoholPercent() {
        assertEquals(16.8, cocktail.getAlcoholPercent());
    }
    /**
     * Test checking if a Cocktail is alcoholic works
     */
    @Test
    public void testIsAlcoholic() {
        assertTrue(cocktail.isAlcoholic());
    }
    /**
     * Test if getting the alcohol percentage works if a Cocktail has zero percent
     */
    @Test
    public void testGetAlcoholPercentZero() {
        List<Liquid> ingredients = new ArrayList<>();
        ingredients.add(new Liquid("Soda Water", 0.5, 0));
        Cocktail nonAlcoholicCocktail = new Cocktail("Soda Water", ingredients);
        assertEquals(0.0, nonAlcoholicCocktail.getAlcoholPercent());
    }
    /**
     * Test checking if a Cocktail is not alcoholic works
     */
    @Test
    public void testIsNotAlcoholic() {
        List<Liquid> ingredients = new ArrayList<>();
        ingredients.add(new Liquid("Soda Water", 0.5, 0));
        Cocktail nonAlcoholicCocktail = new Cocktail("Soda Water", ingredients);
        assertFalse(nonAlcoholicCocktail.isAlcoholic());
    }
    /**
     * Test if getting the cocktail name works
     */
    @Test
    public void testGetName() {
        assertEquals("Mojito", cocktail.getName());
    }
    /**
     * Test if setting the cocktail name works
     */
    @Test
    public void testSetName() {
       cocktail.setName("Sparkling Water");
        assertEquals("Sparkling Water", cocktail.getName());
    }
}
