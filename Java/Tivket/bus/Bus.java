public class Bus {
    private String source;
    private String destination;
    private String busNumber;
    private int totalSeats;
    private int availableSeats;
    private String departureTime;
    private double ticketPrice;

    public Bus(String source, String destination, String busNumber, int totalSeats, String departureTime,
            double ticketPrice) {
        this.source = source;
        this.destination = destination;
        this.busNumber = busNumber;
        this.totalSeats = totalSeats;
        this.availableSeats = totalSeats;
        this.departureTime = departureTime;
        this.ticketPrice = ticketPrice;
    }

    public String getSource() {
        return source;
    }

    public String getDestination() {
        return destination;
    }

    public String getBusNumber() {
        return busNumber;
    }

    public int getTotalSeats() {
        return totalSeats;
    }

    public int getAvailableSeats() {
        return availableSeats;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public double getTicketPrice() {
        return ticketPrice;
    }

    public void bookSeat() {
        if (availableSeats > 0) {
            availableSeats--;
            System.out.println("Seat reserved : " + (getTotalSeats() - getAvailableSeats()));

        } else {
            System.out.println("Sorry, no seats available on this bus.");
        }
    }
}