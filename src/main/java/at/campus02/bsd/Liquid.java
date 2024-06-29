package at.campus02.bsd;

/**
 * Object Class that describes a liquid that you can use for a Drink
 */
public class Liquid {
    /**
     * name of the Liquid
     */
    private String name;
    /**
     * Volume of the Liquid in litres
     */
    private double volume;

    /**
     * Alcohol percentage of the liquid (eg 42 for 42%)
     */
    private double alcoholPercent;

    /**
     * Constructor for a Liquid
     * @param name Name of the Liquid
     * @param volume Volume of the Liquid
     * @param alcoholPercent Alcohol percentage of the Liquid
     */
    public Liquid(String name, double volume, double alcoholPercent) {
        this.name = name;
        this.volume = volume;
        this.alcoholPercent = alcoholPercent;
    }

    /**
     * Getter for the Liquidname
     *
     * @return name of the liquid
     */
    public String getName() {
        return name;
    }

    /**
     * Setter for the Liquidname
     *
     * @param name desired name of the Liquid
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Getter to get the Volume of the Liquid
     * @return Volume of the Liquid
     */
    public double getVolume() {
        return volume;
    }

    /**
     * Setter to set the Volume of the Liquid
     * @param volume Volume of the Liquid
     */
    public void setVolume(double volume) {
        this.volume = volume;
    }

    /**
     * Getter to get the AlcoholPercentage of the Liquid
     *
     * @return Alcohol Percentage of the Liquid
     */
    public double getAlcoholPercent() {
        return alcoholPercent;
    }
    /**
     * Setter to set the AlcoholPercentage of the Liquid
     *
     * @param alcoholPercent Alcohol Percentage of the Liquid
     */
    public void setAlcoholPercent(double alcoholPercent) {
        this.alcoholPercent = alcoholPercent;
    }
}
