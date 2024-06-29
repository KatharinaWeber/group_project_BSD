package at.campus02.bsd;

import java.util.List;

public class Cocktail extends Drink {
private List<Liquid> ingredients;

    public Cocktail(String name, List<Liquid> ingredients) {
        super(name);
        this.ingredients = ingredients;
    }

    @Override
    public double getVolume() {
        double totalVolume = 0.0;
        for (int i = 0; i < ingredients.size(); i++) {
            totalVolume += ingredients.get(i).getVolume();
        }
        return totalVolume;
    }


    @Override
    public double getAlcoholPercent() {
        double totalVolume = getVolume();
        double alcoholVolume = 0.0;
        for (int i = 0; i < ingredients.size(); i++) {
            alcoholVolume += ingredients.get(i).getVolume() * (ingredients.get(i).getAlcoholPercent() / 100.0);
        }
        if (alcoholVolume == 0) {
            return 0;
        } else {
            return (alcoholVolume / totalVolume) * 100;
        }
    }

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

