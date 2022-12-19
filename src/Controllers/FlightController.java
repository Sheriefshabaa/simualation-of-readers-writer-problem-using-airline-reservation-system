package Controllers;
import Models.*;
import java.util.*;

public class FlightController extends Flight implements Runnable {
    FlightDate thisFlight = new FlightDate();
    private int overFlowSeats;
    public int flightInfo(int totalSeatsForTheWholeFlight,int individualFlightCapacity){
        overFlowSeats = totalSeatsForTheWholeFlight%individualFlightCapacity;
        int numberOfCreatedFlights = (totalSeatsForTheWholeFlight-overFlowSeats)/individualFlightCapacity ;
        Flight.setTotal_seats(individualFlightCapacity);
        return numberOfCreatedFlights;
    }
    public int getOverFlowSeats() {
        return overFlowSeats;
    }

    @Override
    public void run() {

    }
}
