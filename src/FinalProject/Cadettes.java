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
    public Cadettes(String name, int age) {
        super(name, age);
    }

    /**
     *
     * @return reward string
     */
    @Override
    public String getReward() {
        return "Disneyland";
    }
}
