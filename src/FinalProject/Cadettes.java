package FinalProject;

public class Cadettes extends GirlScout {
    /**
     * constructor
     */
    public Cadettes() {
    }

    /**
     * Parameterized constructor
     * @param name of girl from input
     * @param age of girl from input
     */
    public Cadettes(String name, int age, String troop) {
        super(name, age, troop);
    }

    /**
     *
     * @return reward string
     */
    @Override
    public String getReward() {
        return "Disneyland";
    }

    // Constant variable
    final int MIN_AMOUNT = 20;

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
