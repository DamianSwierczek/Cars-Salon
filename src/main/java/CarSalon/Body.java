package CarSalon;

public enum Body {
    SEDAN(0),
    PICKUP(2000),
    HATCHBACK(1000),
    KOMBI(1000);

    public int cost;

    Body(int cost) {
        this.cost = cost;
    }

    public int getCost() {
        return cost;
    }
}
