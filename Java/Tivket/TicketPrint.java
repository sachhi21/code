package Tivket;

public class TicketPrint {
    private Buses bus;
    private String passengerName;
    private int age;
    private String email;

    public TicketPrint(Buses bus, String passengerName, int age, String email) {
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

}
