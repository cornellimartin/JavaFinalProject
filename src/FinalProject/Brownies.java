package FinalProject;

public class Brownies extends GirlScout {
    /**
     * constructor
     */
    public Brownies() {
    }

    /**
     * Parameterized constructor
     * @param name of girl from input
     * @param age of girl from input
     */
    public Brownies(String name, int age, String troop) {
        super(name, age, troop);
    }

    /**
     *
     * @return reward string
     */
    @Override
    public String getReward() {
        return "Amusement Park";
    }

    // Constant variable
    final int MIN_AMOUNT = 10;

    /** Set a new QUALIFIED */
    public void setQualified() {
        if (calculateTotalCookiesSold() >= MIN_AMOUNT) {
            qualified = true;
        }
        else {
            qualified = false;
        }
    }
}
