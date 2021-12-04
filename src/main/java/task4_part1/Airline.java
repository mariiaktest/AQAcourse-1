package task4_part1;

import java.util.List;
import java.util.Objects;

public class Airline {
    String destination;
    int flight;
    String type;
    String departure;
    List<DayOfWeek> days;

    Airline(String destination, int flight, String type, String departure, List<DayOfWeek> days){
        this.destination = destination;
        this.flight = flight;
        this.type = type;
        this.departure = departure;
        this.days = days;
    }

    public String getDestination() {
        return this.destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public int getFlight() {
        return this.flight;
    }

    public void setFlight(int flight) {
        this.flight = flight;
    }

    public String getType() { return this.type; }

    public void setType(String type) { this.type = type; }

    public String getDeparture() { return this.departure; }

    public void setDeparture(String departure) { this.departure = departure; }

    public List<DayOfWeek> getDays() {
        return this.days;
    }

    public void setDays(List<DayOfWeek> days) { this.days = days; }

    public String getAllDays() {
        String days = "";

        for (int i = 0; i < this.days.size(); i++) {
            days += i == 0 ? "" : ", ";
            days += this.days.get(i).getName();
        }

        return days;
    }

    @Override
    public String toString() {
        return "Flight:" +
                " " + flight +
                " " + destination +
                " " + type +
                " " + departure +
                " (" + getAllDays() + ")";
    }

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (!(o instanceof Airline)) return false;
//        Airline airline = (Airline) o;
//        return getFlight() == airline.getFlight() && getType() == airline.getType() && getDeparture() == airline.getDeparture() && Objects.equals(getDestination(), airline.getDestination()) && Objects.equals(getDays(), airline.getDays());
//    }

    @Override
    public int hashCode() {
        return Objects.hash(getDestination(), getFlight(), getType(), getDeparture(), getDays());
    }
}
