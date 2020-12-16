package Task2;

public class Drink implements Item {
    private final int ZERO_COST = 0;
    private final double cost;
    private final String name;
    private final String description;

    public Drink(String name, String description, double cost) {
        this.cost = cost;
        this.name = name;
        this.description = description;
    }

    public Drink(String name, String description) {
        this.cost = ZERO_COST;
        this.name = name;
        this.description = description;
    }

    @Override
    public double getCost() {
        return cost;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return "Drink{" +
                "cost=" + cost +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}