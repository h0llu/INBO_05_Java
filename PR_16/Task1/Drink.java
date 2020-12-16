package Task1;

public final class Drink {
    private final int ZERO_COST = 0;
    private final int cost;
    private final String name;
    private final String description;

    public Drink(int cost, String name, String description) {
        this.cost = cost;
        this.name = name;
        this.description = description;
    }

    public Drink(String name, String description) {
        this.cost = ZERO_COST;
        this.name = name;
        this.description = description;
    }

    public int getCost() {
        return cost;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }
}