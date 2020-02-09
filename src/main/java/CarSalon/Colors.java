package CarSalon;

public enum Colors {
    WHITE(0),
    BLACK(0),
    RED(200),
    BLUE(200),
    GREEN(200);

    public int cost;

    public int getCost() {
        return cost;
    }

    Colors(int cost){
        this.cost = cost;
    }
}
