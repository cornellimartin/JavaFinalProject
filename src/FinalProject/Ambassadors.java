package FinalProject;

public class Ambassadors extends GirlScout {
    public Ambassadors() {
    }
    public Ambassadors(String name, int age) {
        super(name, age);
    }

    @Override
    public String getReward() {
        return "Disneyland";
    }
}
