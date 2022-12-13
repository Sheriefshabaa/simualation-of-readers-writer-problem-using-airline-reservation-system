package Models;

public class Passenger {
    //attributes
    private int profileId;
    private String mail;
    private int phone;
    private String firstName;
    private String lastName;
    private String flightStatus ="Pending";
    //for all private attributes the getter will be assigned to a variable and wii be used with the query
    /*i.e. variable = getter function
    * query("use the variable")*/
    //getters
    public int getProfileId() {
        return profileId;
    }

    public String getMail() {
        return mail;
    }

    public int getPhone() {
        return phone;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
    public String getFlightStatus() {
        return flightStatus;
    }
    //constructors
    public Passenger (){

    }
    //constructor to read the initial values for passenger.
    public Passenger(int pId,String fName,String lName,String mail,int phone){

    }
    //Setters
    public void setProfileId(int profileId) {
        this.profileId = profileId;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }



    public void setFlightStatus(String flightStatus) {
        this.flightStatus = flightStatus;
    }
}
