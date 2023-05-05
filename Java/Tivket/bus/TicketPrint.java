import java.util.Scanner;

public class TicketPrint {
    private Bus bus;
    private String passengerName;
    private int age;
    private String email;

    public TicketPrint(Bus bus, String passengerName, int age, String email) {
        this.bus = bus;
        this.passengerName = passengerName;
        this.age = age;
        this.email = email;

    }

    public String toString() {
        System.out.println("\nTicket booked Successfully");
        System.out.println("\nTicket Details:");

        return "\nBus ID: " + bus.getBusNumber() + "\nSource:" + bus.getSource() + "\nDestination:"
                + bus.getDestination()
                + "\nDeparture time:" + bus.getDepartureTime() + "\nTicket Price:" + bus.getTicketPrice()
                + "\nName of the passenger: " + passengerName + "\nAge: " + age + "\nEmail: "
                + email + " \n";

    }

    public void getDetails() {
        Scanner scanner = new Scanner(System.in);
        System.out
                .println("Bus number: " + bus.getBusNumber() + ", available seats: " + bus.getAvailableSeats()
                        + "Departure Time: " + bus.getDepartureTime() + " Ticket Price : "
                        + bus.getTicketPrice());

        System.out.print("Enter your name: ");

        String name = scanner.nextLine();

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter your email: ");
        String email = scanner.nextLine();
        TicketPrint ticket = new TicketPrint(bus, name, age, email);
        System.out.println(ticket);
    }

}
