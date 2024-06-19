public class Participant {

    private int id ;
    private String name ;
    private String email;
    private Boolean checkedIn ;

    
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
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public Boolean getCheckedIn() {
        return checkedIn;
    }
    public void setCheckedIn(Boolean checkedIn) {
        this.checkedIn = checkedIn;
    }

}
