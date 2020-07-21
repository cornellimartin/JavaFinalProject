package FinalProject;

public class Seniors extends GirlScout {
    /**
     * constructor
     */
    public Seniors() {
    }

    /**
     * Parameterized constructor
     * @param name of girl from input
     * @param age of girl from input
     */
    public Seniors(String name, int age, String troop) {
        super(name, age, troop);
    }

    /**
     *
     * @return reward string
     */
    @Override
    public String getReward() {
        if(qualified) {
            return "Space Camp";
        }else{
            return super.getReward();
        }
    }

    // Constant variable
    final int MIN_AMOUNT = 25;

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
