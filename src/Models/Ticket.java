package Models;

public class Ticket {
    protected  int tic_id;
    protected  int  profile_Id;
    protected Flight flight_id;

    public Ticket(int profile_Id, int flight_id) {
        this.profile_Id = profile_Id;
        this.flight_id = new Flight(flight_id);
    }

    public void setTic_id(int tic_id) {
        this.tic_id = tic_id;
    }

    public void setProfile_Id(int profile_Id) {
        this.profile_Id = profile_Id;
    }

    public void setFlight_id(int flight_id) {
        this.flight_id = new Flight(flight_id);
    }

    public int getTic_id() {
        return tic_id;
    }

    public int getProfile_Id() {
        return profile_Id;
    }

    public Flight getFlight_id() {
        return flight_id;
    }
}


