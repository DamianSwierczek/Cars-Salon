package CarSalon;

public enum Fuel {
    BENZINE(0),
    DIESEL(10000),
    HYBRID(15000);

    public int cost;

    Fuel(int cost) {
        this.cost = cost;
    }

    public int getCost() {
        return cost;
    }
}
