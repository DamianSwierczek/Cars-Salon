package CarSalon;

public class Customer {
    String imie;
    int kwota;

    public Customer(String imie, int kwota) {
        this.imie = imie;
        this.kwota = kwota;
    }

    public void setKwota(int kwota) {
        this.kwota = kwota;
    }

    public String getImie() {
        return imie;
    }

    public int getKwota() {
        return kwota;
    }
}
