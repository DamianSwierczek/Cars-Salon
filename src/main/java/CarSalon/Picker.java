package CarSalon;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Picker {
    private List<Car> lista = createListOfCar();
    private Scanner scanner = new Scanner(System.in);
    private Car customerCar;
    private int tries = 0;

    public void pickCar(Customer customer) {
        System.out.println("Twój aktualny stan konta to: " + customer.getKwota() + " zł");
        int numer = 0;
        for (Car car : lista) {
            numer++;
            System.out.println(numer + " " + car.getModel() + " cena: " + car.getCena());
        }
        int wybor = scanner.nextInt();
        switch (wybor) {
            case 1:
                if (customer.getKwota() >= lista.get(0).getCena()) {
                    customerCar = lista.get(0);
                    takeMoneyFromCustomer(customer, customerCar.getCena());
                    pickColor(customer);
                    break;
                } else {
                    if (!numberOfTries(customer)) {
                        break;
                    }
                    pickCar(customer);
                }
                break;
            case 2:
                if (customer.getKwota() >= lista.get(1).getCena()) {
                    customerCar = lista.get(1);
                    int temp = customer.getKwota() - customerCar.getCena();
                    customer.setKwota(temp);
                    pickColor(customer);
                    break;
                } else {
                    if (!numberOfTries(customer)) {
                        break;
                    }
                    pickCar(customer);
                }
                break;
            case 3:
                if (customer.getKwota() >= lista.get(2).getCena()) {
                    customerCar = lista.get(2);
                    int temp = customer.getKwota() - customerCar.getCena();
                    customer.setKwota(temp);
                    pickColor(customer);
                    break;
                } else {
                    if (!numberOfTries(customer)) {
                        break;
                    }
                    pickCar(customer);
                }
                break;
            default:
                pickCar(customer);
                break;
        }

    }

    public void pickColor(Customer customer) {
        System.out.println("Wybierz kolor samochodu albo nacisnij 0 zeby wrocic do wyboru samochodu:");
        System.out.println("Twój aktualny stan konta to: " + customer.getKwota() + " zł");
        int numer = 0;
        for (Colors colors : Colors.values()) {
            numer++;
            System.out.println(numer + " " + colors + " cena " + colors.getCost());
        }
        int wybor = scanner.nextInt();
        switch (wybor) {
            case 0:
                backMoney(customer, customerCar.getCena());
                pickCar(customer);
                break;
            case 1:
                if (customer.getKwota() >= Colors.WHITE.getCost()) {
                    customerCar.setKolor(Colors.WHITE);
                    pickBody(customer);
                    break;
                } else {
                    if (!numberOfTries(customer)) {
                        break;
                    }
                    pickColor(customer);
                }
                break;
            case 2:
                if (customer.getKwota() >= Colors.BLACK.getCost()) {
                    customerCar.setKolor(Colors.BLACK);
                    pickBody(customer);
                    break;
                } else {
                    if (!numberOfTries(customer)) {
                        break;
                    }
                    pickColor(customer);
                }
                break;
            case 3:
                if (customer.getKwota() >= Colors.RED.getCost()) {
                    customerCar.setKolor(Colors.RED);
                    takeMoneyFromCustomer(customer, customerCar.getKolor().getCost());
                    pickBody(customer);
                    break;
                } else {
                    if (!numberOfTries(customer)) {
                        break;
                    }
                    pickColor(customer);
                }
                break;
            case 4:
                if (customer.getKwota() >= Colors.BLUE.getCost()) {
                    customerCar.setKolor(Colors.BLUE);
                    takeMoneyFromCustomer(customer, customerCar.getKolor().getCost());
                    pickBody(customer);
                    break;
                } else {
                    if (!numberOfTries(customer)) {
                        break;
                    }
                    pickColor(customer);
                }
                break;
            case 5:
                if (customer.getKwota() >= Colors.GREEN.getCost()) {
                    customerCar.setKolor(Colors.GREEN);
                    takeMoneyFromCustomer(customer, customerCar.getKolor().getCost());
                    pickBody(customer);
                    break;
                } else {
                    if (!numberOfTries(customer)) {
                        break;
                    }
                    pickColor(customer);
                }
                break;
            default:
                pickColor(customer);
        }
    }

    private void backMoney(Customer customer, int cashBack) {
        customer.setKwota(customer.getKwota() + cashBack);
    }

    private void takeMoneyFromCustomer(Customer customer, int cost) {
        int temp = customer.getKwota() - cost;
        customer.setKwota(temp);
    }

    public void pickBody(Customer customer) {
        System.out.println("Wybierz rodzaj nadwozia. Wciśnij 0 jeśli chcesz powrócić do wyboru koloru.");
        System.out.println("Twój aktualny stan konta to: " + customer.getKwota() + " zł");
        int numer = 0;
        for (Body body : Body.values()) {
            numer++;
            System.out.println(numer + " " + body + " cena " + body.getCost());
        }
        int wybor = scanner.nextInt();
        switch(wybor){
            case 0:
                backMoney(customer, customerCar.getKolor().getCost());
                pickColor(customer);
                break;
            case 1:
                if(customer.getKwota() >= Body.SEDAN.getCost()){
                    customerCar.setNadwozie(Body.SEDAN);
                    pickUpholstery(customer);
                    break;
                } else {
                    if (!numberOfTries(customer)) {
                        break;
                    }
                    pickBody(customer);
                }
                break;
            case 2:
                if(customer.getKwota() >= Body.PICKUP.getCost()){
                    customerCar.setNadwozie(Body.PICKUP);
                    takeMoneyFromCustomer(customer, customerCar.getNadwozie().getCost());
                    pickUpholstery(customer);
                    break;
                } else {
                    if (!numberOfTries(customer)) {
                        break;
                    }
                    pickBody(customer);
                }
                break;
            case 3:
                if(customer.getKwota() >= Body.HATCHBACK.getCost()){
                    customerCar.setNadwozie(Body.HATCHBACK);
                    takeMoneyFromCustomer(customer, customerCar.getNadwozie().getCost());
                    pickUpholstery(customer);
                    break;
                } else {
                    if (!numberOfTries(customer)) {
                        break;
                    }
                    pickBody(customer);
                }
                break;
            case 4:
                if(customer.getKwota() >= Body.KOMBI.getCost()){
                    customerCar.setNadwozie(Body.KOMBI);
                    takeMoneyFromCustomer(customer, customerCar.getNadwozie().getCost());
                    System.out.println("Teraz masz do wykorzystania: " + customer.getKwota() + " zł");
                    pickUpholstery(customer);
                    break;
                } else {
                    if (!numberOfTries(customer)) {
                        break;
                    }
                    pickBody(customer);
                }
                break;
            default:
                pickBody(customer);
        }
    }
    public void pickUpholstery(Customer customer){
        System.out.println("Wybierz rodzaj tapicerki. Wciśnij 0, jesli chcesz wrócić do wyboru nadwozia.");
        System.out.println("Twój aktualny stan konta to: " + customer.getKwota() + " zł");
        int numer = 0;
        for (Upholstery upholstery : Upholstery.values()) {
            numer++;
            System.out.println(numer + " " + upholstery + " " + " cena " + upholstery.getCost());
        }
        int wybor = scanner.nextInt();
        switch(wybor){
            case 0:
                backMoney(customer, customerCar.getNadwozie().getCost());
                pickBody(customer);
                break;
            case 1:
                if(customer.getKwota() >= Upholstery.VELUR.getCost()){
                    customerCar.setTapicerka(Upholstery.VELUR);
                    takeMoneyFromCustomer(customer, customerCar.getTapicerka().getCost());
                    pickFuel(customer);
                    break;
                } else {
                    if(!numberOfTries(customer)){
                        break;
                    }
                    pickUpholstery(customer);
                }
                break;
            case 2:
                if(customer.getKwota() >= Upholstery.LEATHER.getCost()){
                    customerCar.setTapicerka(Upholstery.LEATHER);
                    takeMoneyFromCustomer(customer, customerCar.getTapicerka().getCost());
                    pickFuel(customer);
                    break;
                } else {
                    if(!numberOfTries(customer)){
                        break;
                    }
                    pickUpholstery(customer);
                }
                break;
            case 3:
                if(customer.getKwota() >= Upholstery.QUILTED_LEATHER.getCost()){
                    customerCar.setTapicerka(Upholstery.QUILTED_LEATHER);
                    takeMoneyFromCustomer(customer, customerCar.getTapicerka().getCost());
                    pickFuel(customer);
                    break;
                } else {
                    if(!numberOfTries(customer)){
                        break;
                    }
                    pickUpholstery(customer);
                }
                break;
            default:
                pickUpholstery(customer);
                break;
        }
    }
    public void pickFuel(Customer customer){
        System.out.println("Wybierz rodzaj paliwa. Wciśnij 0, jeśli chcesz powrócić do wyboru tapicerki. ");
        System.out.println("Twój aktualny stan konta to: " + customer.getKwota() + " zł");
        int numer = 0;
        for (Fuel fuel : Fuel.values()) {
            numer++;
            System.out.println(numer + " " + fuel + " cena " + fuel.getCost());
        }
        int wybor = scanner.nextInt();
        switch(wybor){
            case 0:
                backMoney(customer, customerCar.getTapicerka().getCost());
                pickUpholstery(customer);
                break;
            case 1:
                if(customer.getKwota() >= Fuel.BENZINE.getCost()){
                    customerCar.setPaliwo(Fuel.BENZINE);
                    takeMoneyFromCustomer(customer, customerCar.getPaliwo().getCost());
                    showTime(customer);
                    break;
                } else {
                    if(!numberOfTries(customer)){
                        break;
                    }
                    pickFuel(customer);
                }
                break;
            case 2:
                if(customer.getKwota() >= Fuel.DIESEL.getCost()){
                    customerCar.setPaliwo(Fuel.DIESEL);
                    takeMoneyFromCustomer(customer, customerCar.getPaliwo().getCost());
                    showTime(customer);
                    break;
                } else {
                    if(!numberOfTries(customer)){
                        break;
                    }
                    pickFuel(customer);
                }
            case 3:
                if(customer.getKwota() >= Fuel.HYBRID.getCost()){
                    customerCar.setPaliwo(Fuel.HYBRID);
                    takeMoneyFromCustomer(customer, customerCar.getPaliwo().getCost());
                    showTime(customer);
                    break;
                } else {
                    if(!numberOfTries(customer)){
                       break;
                   }
                    pickFuel(customer);
                }
                break;
            default:
                pickFuel(customer);
                break;
        }
    }
    public boolean showTime(Customer customer){
        System.out.println("Parametry twojego samochodu to: ");
        System.out.println("Model: " + customerCar.getModel());
        System.out.println("Kolor: " + customerCar.getKolor());
        System.out.println("Nadwozie: " + customerCar.getNadwozie());
        System.out.println("Tapicerka: " + customerCar.getTapicerka());
        System.out.println("Silnik: " + customerCar.getPaliwo());
        System.out.println("Wybierz 1 aby, potwierdzić zakup auta, lub 0 by wrócić do wyboru silnika");
        int wybor = scanner.nextInt();
        if(wybor == 1){
            System.out.println("Gratulacje! Zakupiles samochod");
            System.out.println("Pozostało Ci " + customer.getKwota() + " zł");
            return false;
        } else if (wybor == 0){
            backMoney(customer,customerCar.getPaliwo().getCost());
            pickFuel(customer);
            return true;
        } else {
            return true;
        }

    }



    private List<Car> createListOfCar() {
        Car car1 = new Car("Seat Leon", Colors.BLACK, Body.SEDAN, Upholstery.VELUR, Fuel.BENZINE,20000);
        Car car2 = new Car("Opel Astra",Colors.BLACK,Body.SEDAN,Upholstery.VELUR,Fuel.BENZINE,30000);
        Car car3 = new Car("Porsche Panamera",Colors.BLACK,Body.SEDAN,Upholstery.VELUR,Fuel.BENZINE,400000);

        List<Car> lista = new ArrayList<>();
        lista.add(car1);
        lista.add(car2);
        lista.add(car3);
        return lista;
    }
    private boolean numberOfTries(Customer customer){
        tries++;
        if (tries == 1){
            System.out.println("Za mało pieniędzy na koncie, pozostały Ci dwie próby.");
            return true;
        } else if (tries == 2){
            System.out.println("Za mało pieniędzy na koncie, pozostała Ci ostatnia próba.");
            return true;
        } else if(tries == 3){
            System.out.println("Prosze wyjść z salonu");
            return false;
        }
        return true;
    }

}
