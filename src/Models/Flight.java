package Models;
import java.util.Date;

public class Flight{

    private  int Flight_id;
    protected String from_loc =" EGYPT --> ";
    protected String to_loc ="Germany .";
    protected Date Arrival_time;
    protected String Duration ;
    protected  static  int total_seats;

    public Flight(String from_loc, String to_loc) {
        this.from_loc = from_loc;
        this.to_loc = to_loc;
    }

    public Flight(int flight_id) {

    }

    public void setFlight_id(int flight_id) {
        Flight_id = flight_id;
    }

    public void setFrom_loc(String from_loc) {
        this.from_loc = from_loc;
    }

    public void setTo_loc(String to_loc) {
        this.to_loc = to_loc;
    }

    public void setArrival_time(Date arrival_time) {
        Arrival_time = arrival_time;
    }

    public void setDuration(String duration) {
        Duration = duration;
    }

    public static void setTotal_seats(int total_seats) {
        Models.Flight.total_seats = total_seats;
    }

    public int getFlight_id() {
        return Flight_id;
    }

    public String getFrom_loc() {
        return from_loc;
    }

    public String getTo_loc() {
        return to_loc;
    }

    public Date getArrival_time() {
        return Arrival_time;
    }

    public String getDuration() {
        return Duration;
    }

    public static int getTotal_seats() {
        return total_seats;
    }

}
