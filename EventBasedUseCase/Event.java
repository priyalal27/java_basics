import java.util.Date;

public class Event {

    private int id;
    private String name ;
    private String description;
    private Date startTime;
    private Date endTime;
    private Boolean started;


    public void setId(int id) {
        this.id = id;
    }


    public void setName(String name) {
        this.name = name;
    }


    public void setDescription(String description) {
        this.description = description;
    }


    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }


    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }


    public void setStarted(Boolean started) {
        this.started = started;
    }


    public int getId() {
        return id;
    }


    public String getName() {
        return name;
    }


    public String getDescription() {
        return description;
    }


    public Date getStartTime() {
        return startTime;
    }


    public Date getEndTime() {
        return endTime;
    }


    public Boolean getStarted() {
        return started;
    }


    Event(int id , String name , String description){
            this.id = id ;
            this.description = description;
            this.name = name ;
    }

    

}
