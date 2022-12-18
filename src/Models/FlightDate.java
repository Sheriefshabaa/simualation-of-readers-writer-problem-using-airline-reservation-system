package Models;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FlightDate {
    SimpleDateFormat dateformatter = new SimpleDateFormat();
    Date thisDate = new Date();

    public String getThisDate() {
        int dayOfFlight = 1;
        thisDate.setDate(dayOfFlight+=2);
        return dateformatter.format(thisDate);
    }




}
