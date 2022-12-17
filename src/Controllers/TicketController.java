package Controllers;
import Models.*;

import java.util.Random;

public class TicketController extends Ticket {
    Ticket ticket  = new Ticket();
    int[] reservedTickets = new int[Flight.getTotal_seats()];
    Random ticketRandomizer = new Random();

    private void createTicket(){
        ticket.setTicketId(ticketRandomizer.nextInt(1000,5000));
    }
    public void tickerInitiator(){

    }

}
