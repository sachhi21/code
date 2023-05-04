package Tivket;

import java.util.Scanner;

interface BusTicketBooking {
    void displayAvailableBuses();

    void bookTicket();
}

class InBus implements BusTicketBooking {
    private Buses[] busess;

    public InBus() {
        busess = new Buses[] {
                new Buses("Mumbai", "Pune", "ABC123", 40, "10:00 AM", 2000),
                new Buses("Pune", "Mumbai", "DEF456", 35, "10:00 AM", 2000),
                new Buses("Mumbai", "Nashik", "GHI789", 30, "10:00 AM", 2000),
                new Buses("Nashik", "Mumbai", "JKL012", 25, "10:00 AM", 2000),
                new Buses("Pune", "Nashik", "MNO345", 20, "10:00 AM", 2000),

        };
    }

    public void displayAvailableBuses() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter source city: ");
        String source = sc.nextLine();
        System.out.print("Enter destination city: ");
        String destination = sc.nextLine();
        boolean busesFound = false;
        for (Buses bus : busess) {
            if (bus.getSource().equalsIgnoreCase(source) && bus.getDestination().equalsIgnoreCase(destination)) {
                System.out.println("\n");

                System.out
                        .println("\nBus number: " + bus.getBusNumber() + "\navailable seats: " + bus.getAvailableSeats()
                                + "\nDeparture Time: " + bus.getDepartureTime() + " \nTicket Price : "
                                + bus.getTicketPrice());
                busesFound = true;
            }
        }
        if (!busesFound) {
            System.out.println("Sorry, no buses available for the given source and destination.");
            System.out.println("\n");

        }
    }

    public void bookTicket() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter bus number: ");
        String busNumber = sc.nextLine();
        boolean busFound = false;
        for (Buses bus : busess) {
            if (bus.getBusNumber().equalsIgnoreCase(busNumber)) {
                bus.bookSeat();
                System.out.println("\nBus Details:");
                System.out
                        .println("Bus number: " + bus.getBusNumber() + ", available seats: " + bus.getAvailableSeats()
                                + "Departure Time: " + bus.getDepartureTime() + " Ticket Price : "
                                + bus.getTicketPrice());

                System.out.print("Enter your name: ");
                String name = sc.nextLine();

                System.out.print("Enter your age: ");
                int age = sc.nextInt();
                sc.nextLine();

                System.out.print("Enter your email: ");
                String email = sc.nextLine();
                busFound = true;
                TicketPrint ticket = new TicketPrint(bus, name, age, email);
                System.out.println(ticket);

                break;
            }
        }
        if (!busFound) {
            System.out.println("Sorry, no bus found with the given bus number.");
            System.out.println("\n");
        }

    }
}
