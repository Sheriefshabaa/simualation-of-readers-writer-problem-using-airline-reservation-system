package Models;

public class Passenger {
    //attributes
    private int profileId;
    private String mail;
    private String phone;
    private String firstName;
    private String lastName;
    private String flightStatus = "Pending";

    //constructors
    public Passenger() {

    }

    //constructor to read the initial values for passenger.
    public Passenger(int pId, String fName, String lName, String mail, int phone) {

    }

    public int getProfileId() {
        return profileId;
    }

    //Setters
    public void setProfileId(int profileId) {
        this.profileId = profileId;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFlightStatus() {
        return flightStatus;
    }

    public void setFlightStatus(String flightStatus) {
        this.flightStatus = flightStatus;
    }
}
