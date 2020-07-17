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
    public Brownies(String name, int age) {
        super(name, age);
    }

    /**
     *
     * @return reward string
     */
    @Override
    public String getReward() {
        return "Amusement Park";
    }
}
