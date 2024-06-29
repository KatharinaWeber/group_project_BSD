package at.campus02.bsd;

import org.junit.jupiter.api.*;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class CocktailTest {
    private Cocktail cocktail;

    @BeforeEach
    public void setCocktail() {
        List<Liquid> liquids = new ArrayList<>();
        liquids.add(new Liquid("White Rum", 0.4, 42));
        liquids.add(new Liquid("Soda Water", 0.5, 0));
        liquids.add(new Liquid("Lime Juice", 0.1, 0));

        cocktail = new Cocktail("Mojito", liquids);
    }

    @Test
    public void testGetVolume() {
        assertEquals(1.0, cocktail.getVolume());
    }

    @Test
    public void testGetAlcoholPercent() {
        assertEquals(16.8, cocktail.getAlcoholPercent());
    }

    @Test
    public void testIsAlcoholic() {
        assertTrue(cocktail.isAlcoholic());
    }

    @Test
    public void testGetAlcoholPercentZero() {
        List<Liquid> ingredients = new ArrayList<>();
        ingredients.add(new Liquid("Soda Water", 0.5, 0));
        Cocktail nonAlcoholicCocktail = new Cocktail("Soda Water", ingredients);
        assertEquals(0.0, nonAlcoholicCocktail.getAlcoholPercent());
    }


    @Test
    public void testIsNotAlcoholic() {
        List<Liquid> ingredients = new ArrayList<>();
        ingredients.add(new Liquid("Soda Water", 0.5, 0));
        Cocktail nonAlcoholicCocktail = new Cocktail("Soda Water", ingredients);
        assertFalse(nonAlcoholicCocktail.isAlcoholic());
    }

    @Test
    public void testGetName() {
        assertEquals("Mojito", cocktail.getName());
    }

    @Test
    public void testSetName() {
       cocktail.setName("Sparkling Water");
        assertEquals("Sparkling Water", cocktail.getName());
    }
}
