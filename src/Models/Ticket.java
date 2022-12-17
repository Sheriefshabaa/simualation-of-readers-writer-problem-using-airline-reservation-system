package Models;

public class Ticket {
    private int ticketId;
    private   int  profileId;
    public void setProfileId(int profileId) {
        this.profileId = profileId;
    }
    public void setTicketId(int ticketId) {
        this.ticketId = ticketId;
    }
    public int getTicketId() {
        return ticketId;
    }
    public int getProfileId() {
        return profileId;
    }

}


