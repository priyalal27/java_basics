public class Venue {

    private int id ;
    private String name ;
    private String description ;
    private String SstreetAddress;
    private String Ccity;
    private String state;
    private String country ;
    private boolean pincode ;

    
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public String getSstreetAddress() {
        return SstreetAddress;
    }
    public void setSstreetAddress(String sstreetAddress) {
        SstreetAddress = sstreetAddress;
    }
    public String getCcity() {
        return Ccity;
    }
    public void setCcity(String ccity) {
        Ccity = ccity;
    }
    public String getState() {
        return state;
    }
    public void setState(String state) {
        this.state = state;
    }
    public String getCountry() {
        return country;
    }
    public void setCountry(String country) {
        this.country = country;
    }
    public boolean isPincode() {
        return pincode;
    }
    public void setPincode(boolean pincode) {
        this.pincode = pincode;
    }

}
