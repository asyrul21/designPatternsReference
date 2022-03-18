package BuilderPattern.Example1;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractVacationBuilder {
    String name;
    List<Accommodation> accommodations = new ArrayList<>();
    List<String> events = new ArrayList<String>();

    public abstract AbstractVacationBuilder addAccommodation();
    public abstract AbstractVacationBuilder addAccommodation(String name);
    public abstract AbstractVacationBuilder addAccommodation(String name, int year, int month, int day, int nights, int location);
    public abstract AbstractVacationBuilder addEvent(String event);

    public Vacation getVacation() {
        Vacation vacation = new Vacation();
        vacation.setName(name);
        vacation.setAccommodations(accommodations);
        vacation.setEvents(events);
        return vacation;
    }
}
