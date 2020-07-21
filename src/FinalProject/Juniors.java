package FinalProject;

public class Juniors extends GirlScout {
    /**
     * constructor
     */
    public Juniors() {
    }

    /**
     * Parameterized constructor
     * @param name of girl from input
     * @param age of girl from input
     */
    public Juniors(String name, int age, String troop) {
        super(name, age, troop);
    }

    /**
     *
     * @return reward string
     */
    @Override
    public String getReward()
    {
        if(qualified) {
            return "Water Park";
        }else{
            return super.getReward();
        }
    }

    // Constant variable
    final int MIN_AMOUNT = 15;

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
