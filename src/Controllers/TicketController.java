package Controllers;
import Models.*;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Random;

public class TicketController extends Ticket implements Runnable {
    int[] bookedTickets = new int[Flight.getTotal_seats()];
    int[] delayedTickets = new int[Flight.getTotal_seats()];
    Random ticketRandomizer = new Random();
    public void ticketInitiator(){
       setTicketId(ticketRandomizer.nextInt(100000,500000));
    }

    @Override
    public void run() {
        Calendar calendar = new GregorianCalendar();
    }
}
