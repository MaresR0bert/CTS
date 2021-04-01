package ro.ase.acs.main;

import ro.ase.acs.adapter.*;

public class Main {
    public static void main(String[] args) {
        FlightBooking flightBooking = new FlightBooking();
        flightBooking.addBooking(1,'B');
        flightBooking.addBooking(1,'C');
        flightBooking.displaySeats();

        System.out.println();
        LowCostFlightBooking lowCostFlightBooking = new LowCostFlightBooking();
        lowCostFlightBooking.reserveFlight();
        lowCostFlightBooking.reserveFlight();
        lowCostFlightBooking.seatMap();

        System.out.println();
        FlightBooking newBooking = new LowCostToFlightBookingAdapter(lowCostFlightBooking);
        newBooking.addBooking(2,'B');
        newBooking.addBooking(2,'C');
        newBooking.displaySeats();

        System.out.println();

        AbstractFlightBooking classBooking = new LowCostToFlightBookingClassAdapter();
        classBooking.addBooking(2,'B');
        classBooking.addBooking(2,'C');
        classBooking.displaySeats();
    }
}
