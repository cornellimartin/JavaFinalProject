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
    public Juniors(String name, int age) {
        super(name, age);
    }

    /**
     *
     * @return reward string
     */
    @Override
    public String getReward() {
        return "Waterpark";
    }
}
