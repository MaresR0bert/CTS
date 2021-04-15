package ro.ase.acs.adapter;

public class LowCostToFlightBookingClassAdapter extends LowCostFlightBooking implements AbstractFlightBooking {

    @Override
    public boolean addBooking(int row, char seat) {
        super.reserveFlight();
        return true;
    }

    @Override
    public void displaySeats() {
        super.seatMap();
    }
}
