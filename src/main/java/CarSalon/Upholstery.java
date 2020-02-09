package CarSalon;

public enum Upholstery {
    VELUR(0),
    LEATHER(1000),
    QUILTED_LEATHER(2000);

    public int cost;

    Upholstery(int cost) {
        this.cost = cost;
    }

    public int getCost() {
        return cost;
    }
}
