import java.util.ArrayList;
import java.util.Scanner;

import static java.lang.System.exit;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayList<Conference> conferences = new ArrayList<>();
        ArrayList<Delegate> delegates = new ArrayList<>();

        while (true) {
            System.out.println("Menu");
            System.out.println("1. Enter information");
            System.out.println("2. Show all data");
            System.out.println("3. Calculate the price of nights in the hotel");
            System.out.println("4. Save the delegate data in list");
            System.out.println("5. Show the delegate data in a specific room number");
            System.out.println("6. Exit");
            System.out.println();
            System.out.print("Choose: "); int n = scanner.nextInt();

            switch (n) {
                case 1:
                    System.out.println();
                    conferences.add(insertData(scanner));
                    break;
                case 2:
                    System.out.println();
                    printData(conferences);
                    break;
                case 3:
                    System.out.println();
                    calculateHotelPriceWithSpecificCity(conferences, scanner);
                    break;
                case 4:
                    System.out.println();
                    showAllDelegatesFromSpecificCity(delegates, scanner);
                    break;
                case 5:
                    System.out.println();
                    showAllDelegatesInSpecificRoomNumber(conferences, scanner);
                    break;
                case 6: exit(0);
                    break;
                default:
                    System.out.println("Invalid input");
                    break;
            }
        }
    }

    public static void printData(ArrayList<Conference> conferences) {
        System.out.println("Print all data!");
        for (Conference h : conferences) {
            System.out.println(h.toString());
        }
    }

    public static Conference insertData(Scanner scanner) {

        Delegate delegate = new Delegate();
        Hotel hotel = new Hotel();
        DelegationCard delegationCard = new DelegationCard();

        return new Conference(delegate, hotel, delegationCard);
    }

    public static void calculateHotelPriceWithSpecificCity(ArrayList<Conference> conferences, Scanner sc) {

        int totalPrice = 0;
        ArrayList<Conference> newConferences = new ArrayList<>();

        System.out.println();
        System.out.println("Enter a city: ");
        String city = sc.nextLine();

        for (Conference c : conferences) {
            if(c.getDelegate().getCity().equals(city)) {
                newConferences.add(c);
                totalPrice += c.getHotel().getOneNightPrice();
            }
        }

        System.out.println("Total price: " + totalPrice);
    }

    public static void showAllDelegatesFromSpecificCity(ArrayList<Delegate> delegates, Scanner sc) {

        ArrayList<Delegate> newDelegates = new ArrayList<>();

        String nothing = sc.nextLine();

        System.out.println();
        System.out.println("Enter a city: ");
        String city = sc.nextLine();

        for (Delegate d : delegates) {
            if(d.getCity().equals(city)) {
                newDelegates.add(d);
            }
        }

        for (Delegate d : newDelegates) {
            System.out.println(d.toString());
        }
    }

    public static void showAllDelegatesInSpecificRoomNumber(ArrayList<Conference> conferences, Scanner sc) {

        ArrayList<Conference> newConferences = new ArrayList<>();

        String nothing = sc.nextLine();

        System.out.println();
        System.out.println("Enter a room number: ");
        int roomNumber = sc.nextInt();

        for (Conference c : conferences) {
            if(c.getHotel().getRoomNumber() == roomNumber) {
                newConferences.add(c);
            }
        }

        for (Conference c : newConferences) {
            System.out.println(c.getDelegate().toString());
        }
    }


}