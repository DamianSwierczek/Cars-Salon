package CarSalon;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Client {

    public static void main(String[] args) {
        Customer customer = new Customer("Damian",200000);
        Picker picker = new Picker();


        Scanner scanner = new Scanner(System.in);
        System.out.println("Witaj " + customer.getImie() + ". Jaki masz budżet?");
        int temp = scanner.nextInt();
        customer.setKwota(temp);
        System.out.println("Wybierz model samochodu:");

        picker.pickCar(customer);
        }
}