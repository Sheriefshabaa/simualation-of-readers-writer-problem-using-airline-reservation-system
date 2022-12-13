package Controllers;
import Models.Passenger;
import java.util.Random;

public class PassengerController extends Passenger {
    String[] definedFirstNames = {"Josh","Saimon","Jack","Messi","Adam","Sarah"};
    String[] definedLastNames = {"Saimon","Josh","Ramy","Jack","Adam","Marcus"};

    String [] ticketStatus = {"BOOKED","DELAYED"};
    Random nameRandomizer = new Random();//data randomizer for changing passenger data
    Random seatsRandomizer = new Random(); // seats randomizer
    Passenger pass = new Passenger(); //object to be changed after each creation
    int randomSeats;// to create seats randomly
    public int seatsRandomizer (){ // this functions manages the randomness of created seats at each thread.
        int requestedSeats;
            requestedSeats = seatsRandomizer.nextInt(1,4);
        return requestedSeats;
    }

    public void createPassenger (){
        //add seats validator to check how many seats needed to be issued to create the requested number of Passengers
        // change the Status for
        int namePosition;
        for (int i = 0; i < randomSeats; i++) {
            namePosition = nameRandomizer.nextInt(0,6);
            pass.setFirstName(definedFirstNames[namePosition]);
            namePosition = nameRandomizer.nextInt(0,6);
            pass.setLastName(definedLastNames[namePosition]);
        }
        System.out.println("Passenger name is : "+ pass.getFirstName() + " " + pass.getLastName() );

    }

}
