public class EventImpl implements EventInter{


    @Override
    public Event create(int id , String name , String description) {
        return new Event(id, name, description);
    }
}
