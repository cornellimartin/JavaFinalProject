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
    public Seniors(String name, int age) {
        super(name, age);
    }

    /**
     *
     * @return reward string
     */
    @Override
    public String getReward() {
        return "Disneyland & Universal";
    }
}
