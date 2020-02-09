package CarSalon;

public class Car {

    String model;
    Colors kolor;
    Body nadwozie;
    Upholstery tapicerka;
    Fuel paliwo;
    int cena;

    public int getCena() {
        return cena;
    }

    public void setCena(int cena) {
        this.cena = cena;
    }

    public Car(String model, Colors kolor, Body nadwozie, Upholstery tapicerka, Fuel paliwo, int cena) {
        this.model = model;
        this.kolor = kolor;
        this.nadwozie = nadwozie;
        this.tapicerka = tapicerka;
        this.paliwo = paliwo;
        this.cena = cena;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Colors getKolor() {
        return kolor;
    }

    public void setKolor(Colors kolor) {
        this.kolor = kolor;
    }

    public Body getNadwozie() {
        return nadwozie;
    }

    public void setNadwozie(Body nadwozie) {
        this.nadwozie = nadwozie;
    }

    public Upholstery getTapicerka() {
        return tapicerka;
    }

    public void setTapicerka(Upholstery tapicerka) {
        this.tapicerka = tapicerka;
    }

    public Fuel getPaliwo() {
        return paliwo;
    }

    public void setPaliwo(Fuel paliwo) {
        this.paliwo = paliwo;
    }
}
