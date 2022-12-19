package Models;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FlightDate {
    SimpleDateFormat dateformatter = new SimpleDateFormat();
    Date thisDate = new Date();
    int dayOfFlight = 1;
    public void setThisDate() {
        this.thisDate.setDate(dayOfFlight+=2);
    }

    public String getThisDate() {
        return dateformatter.format(thisDate);
    }




}
