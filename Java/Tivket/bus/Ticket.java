import java.util.HashMap;
import java.util.Scanner;

interface BusTicketBooking {
    void displayAvailableBuses();

    void bookTicket();
}

class BusTicketBookingImpl implements BusTicketBooking {
    private HashMap<String, Bus> buses;

    public BusTicketBookingImpl() {
        buses = new HashMap<>();
        buses.put("ABC123", new Bus("Mumbai", "Pune", "ABC123", 40, "10:00 AM", 2000));
        buses.put("DEF456", new Bus("Pune", "Mumbai", "DEF456", 35, "10:00 AM", 2000));
        buses.put("GHI789", new Bus("Mumbai", "Nashik", "GHI789", 30, "10:00 AM", 2000));
        buses.put("JKL012", new Bus("Nashik", "Mumbai", "JKL012", 25, "10:00 AM", 2000));
        buses.put("MNO345", new Bus("Pune", "Nashik", "MNO345", 20, "10:00 AM", 2000));
        buses.put("PQR678", new Bus("Nashik", "Pune", "PQR678", 15, "10:00 AM", 2000));
    }

    public void displayAvailableBuses() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter source city: ");
        String source = scanner.nextLine();
        System.out.print("Enter destination city: ");
        String destination = scanner.nextLine();
        boolean busesFound = false;
        for (Bus bus : buses.values()) {
            if (bus.getSource().equalsIgnoreCase(source) && bus.getDestination().equalsIgnoreCase(destination)) {
                System.out
                        .println("Bus number: " + bus.getBusNumber() + ", available seats: " + bus.getAvailableSeats()
                                + "\nDeparture Time: " + bus.getDepartureTime() + " \nTicket Price : "
                                + bus.getTicketPrice());
                busesFound = true;
            }
        }
        if (!busesFound) {
            System.out.println("Sorry, no buses available for the given source and destination.");
        }
    }

    public void bookTicket() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter bus number: ");
        String busNumber = scanner.nextLine();
        Bus bus = buses.get(busNumber);
        if (bus != null) {
            bus.bookSeat();

            System.out.print("Enter your name: ");

            String name = scanner.nextLine();

            System.out.print("Enter your age: ");
            int age = scanner.nextInt();
            scanner.nextLine();

            System.out.print("Enter your email: ");
            String email = scanner.nextLine();
            TicketPrint ticket = new TicketPrint(bus, name, age, email);
            System.out.println(ticket);

        } else {
            System.out.println("Sorry, no bus found with the given bus number.");
        }
    }

}