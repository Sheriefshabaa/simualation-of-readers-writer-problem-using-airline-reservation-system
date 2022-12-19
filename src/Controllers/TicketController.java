package Controllers;
import Models.*;
import java.util.Random;

public class TicketController extends Ticket{
    int[] bookedTickets = new int[Flight.getTotal_seats()];
    int[] delayedTickets = new int[Flight.getTotal_seats()];
    Random ticketRandomizer = new Random();
    public void ticketInitiator(){
       setTicketId(ticketRandomizer.nextInt(100000,500000));
    }
}
