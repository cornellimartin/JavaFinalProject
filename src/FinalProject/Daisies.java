package FinalProject;

public class Daisies extends GirlScout {
    /**
     * constructor
     */
    public Daisies() {
    }

    /**
     * Parameterized constructor
     * @param name of girl from input
     * @param age of girl from input
     */
    public Daisies(String name, int age, String troop) {
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
            return "Mini Golf";
        }else{
            return super.getReward();
        }
    }

    // Constant variable
    final int MIN_AMOUNT = 5;

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
