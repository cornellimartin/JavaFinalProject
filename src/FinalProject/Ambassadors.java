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
    public Ambassadors(String name, int age) {
        super(name, age);
    }

    /**
     *
     * @return reward string
     */
    @Override
    public String getReward() {
        return "Disney Cruise";
    }
}
