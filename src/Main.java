import ReadersAndWriters.*;
import Models.*;
import Controllers.*;
import java.util.Scanner;
import java.util.concurrent.*;

public class Main implements Runnable {
    public static void main(String[] args) throws Exception {
        //ExecutorService executor = Executors.newFixedThreadPool(3);
        //prompts
        System.out.println("Hello Admin!\nThis Program is an Airline reservation System Using Multithreading.");
        System.out.println("First we need to setup some configuration to start the execution.");
        //Variables&Objects
        PassengerController passengerController = new PassengerController();
        FlightController flightController= new FlightController();
        TicketController ticketController = new TicketController();
        FlightController currentFlight = new FlightController();
        FlightController delayedFlight = new FlightController() ;
        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter the intended Number of Sets for This Flight : ");
        int TheWholeFlightCapacity = input.nextInt();
        System.out.print("That's Really Great; can you provide me one more information about the individual flight size :");
        int individualFlightCapacity = input.nextInt();
        System.out.println("Thanks! now let's start the execution...");
        int numberOfCreatedFlights = flightController.flightInfo(TheWholeFlightCapacity,individualFlightCapacity);
        System.out.println("the number of flights is : "+numberOfCreatedFlights
                +" each flight consist of "+individualFlightCapacity+" Seats");
        System.out.println("the overflow Seats are : "+flightController.getOverFlowSeats()+" These seats will be reserved independently after finishing the available flights.");
        System.out.println("Passenger name\t\tTicket ID\tPhone\tFlight status\tSeat Number\tFlight ID\tAir line\t\tdeparture\t\t\t Landing\t\t\t  Duration\t\tTake-off Date");
            currentFlight.setFlight_id();
            delayedFlight.setFlight_id();
        for (int i = 0; i < individualFlightCapacity; i++) {
            passengerController.createPassenger();
        }

    }

    @Override
    public void run() {

    }
}