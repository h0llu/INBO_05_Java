package Task2;

public final class Dish implements Item {
    private final double ZERO_COST = 0;
    private final double cost;
    private final String name;
    private final String description;

    public Dish(String name, String description, double cost) {
        this.cost = cost;
        this.name = name;
        this.description = description;
    }

    public Dish(String name, String description) {
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
        return "Dish{" +
                "cost=" + cost +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}