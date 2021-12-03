package homework4part1;

import lecture4.TwoDShape;
import org.w3c.dom.ls.LSOutput;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.ArrayList;

public class Flights {
    // init dynamic list of airlines
    static List<Airline> airlines = new ArrayList<>();
    // init dynamic list of days in week (change to static array with 7 elements)
    static List<DayOfWeek> daysOfWeek = new ArrayList<>(){{
       add(new DayOfWeek(1, "Monday"));
       add(new DayOfWeek(2, "Tuesday"));
       add(new DayOfWeek(3, "Wednesday"));
       add(new DayOfWeek(4, "Thursday"));
       add(new DayOfWeek(5, "Friday"));
       add(new DayOfWeek(6, "Saturday"));
       add(new DayOfWeek(7, "Sunday"));
    }};

    public static void main(String[] args) throws ParseException, IOException {
        // From console
        // 1 - destination
        // 2 - day
        // 3 - time (format: HH:mm)
        // 4 - day with time
        // 5 - 1,2,3
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // Change to write from console
        System.out.print("Destination: ");
        String searchDestination = br.readLine();
        System.out.print("Day: ");
        String searchDay = br.readLine();
        System.out.print("Departure (example 18:00): ");
        String searchDeparture = br.readLine();

        List<Airline> airlinesByDestination = new ArrayList<>();
        List<Airline> airlinesByDayOfWeek = new ArrayList<>();
        List<Airline> airlinesByDeparture = new ArrayList<>();

        SimpleDateFormat parser = new SimpleDateFormat("HH:mm");

        initAirlines();

        for (Airline airline : airlines) {
            List<DayOfWeek> days = airline.getDays();

            if (airline.getDestination().equals(searchDestination)) {
                airlinesByDestination.add(airline);
            }

            Date dateTimeNow = parser.parse(searchDeparture);
            Date departure = parser.parse(airline.getDeparture());

            for (DayOfWeek day : days) {
                if (day.getName().equals(searchDay)) {
                    airlinesByDayOfWeek.add(airline);
                }

                if (dateTimeNow.before(departure) && day.getName().equals(searchDay)) {
                    airlinesByDeparture.add(airline);
                }
            }
        }

        System.out.println("\nAirlines to " + searchDestination);
        renderAirlines(airlinesByDestination);
        System.out.println("\nAirlines on " + searchDay);
        renderAirlines(airlinesByDayOfWeek);
        System.out.println("\nAirlines on " + searchDay + " at " + searchDeparture);
        renderAirlines(airlinesByDeparture);
    }

    private static void renderAirlines(List<Airline> airlinesForRender) {
        if (airlinesForRender.size() == 0) {
            System.out.println("There are no available flights");
            return;
        }

        for (Airline airline : airlinesForRender) {
            System.out.println(airline.toString());
        }
    }

    private static void newAirline(String destination, int flight, String type, String departure, List<DayOfWeek> days) {
        Airline airline = new Airline(destination, flight, type, departure, days);

        airlines.add(airline);
    }

    private static List<DayOfWeek> getListOfDays(ArrayList<Integer> days) {
        List<DayOfWeek> listOfDays = new ArrayList<>();

        for (int dayIndex : days) {
            DayOfWeek dayOfWeek = daysOfWeek.get(dayIndex - 1);

            listOfDays.add(dayOfWeek);
        }

        return listOfDays;
    }

    private static void initAirlines() {
        newAirline("Cologne", 9596, "Aerobus", "18:35", getListOfDays(new ArrayList<>(){{
            add(1);
            add(2);
        }}));
        newAirline("Kharkov", 3216, "Aerobus", "12:24", getListOfDays(new ArrayList<>(){{
            add(1);
            add(2);
        }}));
        newAirline("Berlin", 4325, "Aerobus", "08:40", getListOfDays(new ArrayList<>(){{
            add(3);
            add(4);
        }}));
        newAirline("Amsterdam", 1234, "Aerobus", "14:30", getListOfDays(new ArrayList<>(){{
            add(3);
            add(4);
        }}));
        newAirline("Brussels", 2345, "Aerobus", "22:35", getListOfDays(new ArrayList<>(){{
            add(5);
            add(6);
        }}));
        newAirline("Paris", 6543, "Aerobus", "20:04", getListOfDays(new ArrayList<>(){{
            add(5);
            add(6);
        }}));
        newAirline("Krakow", 3256, "Aerobus", "23:21", getListOfDays(new ArrayList<>(){{
            add(7);
        }}));
    }
}
