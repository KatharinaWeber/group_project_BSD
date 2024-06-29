package at.campus02.bsd;

import java.util.List;

/**
 * Class Cocktail that is extended from the abstract class Drink
 */
public class Cocktail extends Drink {
    /**
     * List of Liquids that the Cocktail contains
     */
    private List<Liquid> ingredients;

    /**
     * Constructor for a Cocktail
     *
     * @param name Name of the Cocktail
     * @param ingredients Ingredients of the Cocktail
     */
    public Cocktail(String name, List<Liquid> ingredients) {
        super(name);
        this.ingredients = ingredients;
    }

    /**
     * Getter to get the total volume of the Cocktail by adding together the volumes of the individual ingredients
     *
     * @return total Volume of the Cocktail
     */
    @Override
    public double getVolume() {
        double totalVolume = 0.0;
        for (int i = 0; i < ingredients.size(); i++) {
            totalVolume += ingredients.get(i).getVolume();
        }
        return totalVolume;
    }

    /**
     * Getter to get the total Percentage of the Cocktail
     *
     * by adding together the Volume times the Alcoholpercentage divided by 100 of every ingredient
     * except if the volume is 0 or in every other case it's the alcohol volume divided by total volume multiplied by 100
     *
     * @return the alcohol percentage of the Cocktail
     */
    @Override
    public double getAlcoholPercent() {
        double totalVolume = getVolume();
        double alcoholVolume = 0.0;
        for (int i = 0; i < ingredients.size(); i++) {
            alcoholVolume += ingredients.get(i).getVolume() * (ingredients.get(i).getAlcoholPercent() / 100.0);
        }
        if (totalVolume == 0) {
            return 0;
        } else {
            return (alcoholVolume / totalVolume) * 100;
        }
    }

    /**
     * checks if the Cocktail contains Alcohol by checking if an ingredient has an alcohol percentage greater than 0
     *
     * @return if the Cocktail is alcoholic or not
     */
    @Override
    public boolean isAlcoholic() {
        for (int i = 0; i < ingredients.size(); i++) {
            if (ingredients.get(i).getAlcoholPercent() > 0) {
                return true;
            }
        }
        return false;
    }

}

