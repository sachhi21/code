
import java.util.Scanner;

public class Book {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BusTicketBooking busTicketBooking = new BusTicketBookingImpl();

        while (true) {
            System.out.println("1. Display available buses");
            System.out.println("2. Book ticket");
            System.out.println("3. Exit");
            System.out.print("Enter choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:
                    busTicketBooking.displayAvailableBuses();
                    break;
                case 2:
                    busTicketBooking.bookTicket();
                    break;
                case 3:
                    System.out.println("Exiting the program.");
                    break;

                default:
                    break;
            }
        }

    }
}
