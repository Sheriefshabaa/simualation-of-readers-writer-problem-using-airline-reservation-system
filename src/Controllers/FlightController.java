package Controllers;
import Models.*;
import java.util.*;

public class FlightController extends Flight implements Runnable {
    Flight flight = new Flight();

    public void flightInfo(){// called once to specify the number of seats and will be fixed.
        Scanner input = new Scanner(System.in);
        System.out.print("total number of seats : "); //experimental version will be changed after creating a deadline limits
        int totalSeats = input.nextInt();
        Flight.setTotal_seats(totalSeats);
    }
    /*public int flightInitiator(){
        flight.setFlight_id(createFlight());
        return getFlight_id();
    }*/

    @Override
    public void run() {

    }
}
