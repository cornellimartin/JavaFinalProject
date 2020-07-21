package FinalProject;

public class Ambassadors extends GirlScout {
    /**
     * constructor
     */
    public Ambassadors() {
    }

    /**
     * Parameterized constructor
     * @param name of girl from input
     * @param age of girl from input
     */
    public Ambassadors(String name, int age, String troop) {
        super(name, age, troop);
    }

    /**
     * getReward Method
     * @return reward string
     */
    @Override
    public String getReward() {
        if(qualified) {
            return "Disney Cruise";
        }else{
            return super.getReward();
        }
    }

    // Constant variable
    final int MIN_AMOUNT = 30;

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
