package Controllers;
import Models.*;
import java.util.*;
public class PassengerController extends Passenger {
    private final String[] definedFirstNames = {"Josh","James","Jack","William","Adam","Sarah","Monika"};
    private final String[] definedLastNames = {"Oliver","Lucas","Henry","Theodore","Noah","Marcus","Zayn"};
     private final String [] definedNumbers = {"65286","45823","13597","41397","98158","81253","71963"};
     private final String [] ticketStatus = {"BOOKED","DELAYED"};
     Flight currentFlight = new Flight();
     Flight delayedFlight = new Flight();
     FlightController flightController = new FlightController();
     Scanner input = new Scanner(System.in);
    Random nameRandomizer = new Random();//data randomizer for changing passenger data
    Random seatsRandomizer = new Random();// seats randomizer
    Random phoneRandomizer = new Random();//phone number builder
    Passenger pass = new Passenger();//object to be changed after each creation
    private int seatsRandomizer (){ // this functions manages the randomness of created seats at each thread.
        int requestedSeats;
        requestedSeats = seatsRandomizer.nextInt(1,4);
        return requestedSeats;
    }
    private void passengerInitiator(){
        int namePosition;
        int phoneNum;
        namePosition = nameRandomizer.nextInt(0, 7);
        pass.setFirstName(definedFirstNames[namePosition]);
        namePosition = nameRandomizer.nextInt(0, 7);
        pass.setLastName(definedLastNames[namePosition]);
        phoneNum = phoneRandomizer.nextInt(0, 7);
        pass.setPhone(definedNumbers[phoneNum]);
    }
    // to create seats randomly
    public void createPassenger () {
        flightController.flightInfo();
        currentFlight.setFlight_id();
        delayedFlight.setFlight_id();
        int totalSeats = Flight.getTotal_seats();
        int currentFlightSeatsNumber = 0;
        int delayedFlightSeatsNumber = 0;
        // seats that will be assigned for all flight
        System.out.println("Passenger name\tPhone\tFlight status\tSeat Number\tFlight ID\tAir line\t\tdeparture\t\t\t Landing\t\t\t  Duration");
        while (totalSeats > 0) {
            int bookedSeats = seatsRandomizer();
                if (bookedSeats>totalSeats){
                    for (int i = 1; i <= bookedSeats; i++) {
                        delayedFlightSeatsNumber++;
                        /*System.out.println("Sorry the requested seats are greater than the available seats, your flight will be delayed");
                        System.out.println("The available seats are : "+ totalSeats+ " and The requested is : "+bookedSeats);*/
                        passengerInitiator();
                        pass.setFlightStatus(ticketStatus[1]);
                        System.out.print(pass.getFirstName() + " " + pass.getLastName() + "\t\t" + pass.getPhone() + "\t\t" + pass.getFlightStatus() + "\t\t\t" + delayedFlightSeatsNumber + "\t\t" + delayedFlight.getFlight_id() + "\t\t" + delayedFlight.getAirLine() + "\t\t" + delayedFlight.getFrom_loc() + "\t\t" + delayedFlight.getTo_loc() + "\t\t" + delayedFlight.getDuration() + "\n");
                    }
                }
                else {
                    totalSeats = totalSeats - bookedSeats;
                    for (int i = 1; i <= bookedSeats; i++) {
                        currentFlightSeatsNumber++;
                        passengerInitiator();
                        pass.setFlightStatus(ticketStatus[0]);
                        System.out.print(pass.getFirstName() + " " + pass.getLastName() + "\t\t" + pass.getPhone() + "\t\t" + pass.getFlightStatus() + "\t\t\t" + currentFlightSeatsNumber + "\t\t" + currentFlight.getFlight_id() + "\t\t" + currentFlight.getAirLine() + "\t\t" + currentFlight.getFrom_loc() + "\t\t" + currentFlight.getTo_loc() +"\t\t"+currentFlight.getDuration()+ "\n");

                    }
                }

            }

        }
    }


   /*if (totalSeats !=0) {
           pass.setFlightStatus(ticketStatus[0]);
           }
           else {

           }*/