package Tivket;

class Buses {
    private String source;
    private String destination;
    private String busNumber;
    private int availableSeats;
    private String departureTime;
    private double ticketPrice;

    public Buses(String source, String destination, String busNumber, int availableSeats, String departureTime,
            double ticketPrice) {
        this.source = source;
        this.destination = destination;
        this.busNumber = busNumber;
        this.availableSeats = availableSeats;
        this.ticketPrice = ticketPrice;
        this.departureTime = departureTime;
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

        } else {
            System.out.println("Sorry, no seats available on this bus.");
        }
    }
}