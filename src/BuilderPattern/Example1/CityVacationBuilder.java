package BuilderPattern.Example1;

public class CityVacationBuilder extends AbstractVacationBuilder {
    public CityVacationBuilder() {
        this.name = "City Vacation Builder";
    }
    public AbstractVacationBuilder addAccommodation() {
        this.accommodations.add(new Hotel());
        return this;
    }
    public AbstractVacationBuilder addAccommodation(String name) {
        this.accommodations.add(new Hotel(name));
        return this;
    }
    public AbstractVacationBuilder addAccommodation(String name, int year, int month, int day, int nights, int location) {
        Reservation reservation = new Reservation();
        reservation.setArrivalDate(year, month, day);
        reservation.setNights(nights);

        Hotel hotel = new Hotel(name);
        hotel.setReservation(reservation);
        hotel.setRoomNumber(location);
        this.accommodations.add(hotel);
        return this;
    }
    public AbstractVacationBuilder addEvent(String event) {
        this.events.add("See the " + event + " show");
        return this;
    }
}
