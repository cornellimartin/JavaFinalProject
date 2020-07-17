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
    public Daisies(String name, int age) {
        super(name, age);
    }

    /**
     *
     * @return reward string
     */
    @Override
    public String getReward() {
        return "Mini Golf";
    }
}
