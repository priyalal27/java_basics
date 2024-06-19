//import Organiser.*;

public class TestEventBasedUseCase {


    public static void main(String[] args) {
        

        Organiser org = new Organiser();
        // org.id = 1111;
        // System.out.println(org.id);

        org.setId(22);
        org.setName("Lal");
        System.out.println(org.getId());
        System.out.println(org.getName());



        // // Parameterised Constructor : Event Class 
        // Event evn = new Event(999, "Priya", "Organising the Event");
        // System.out.println(evn.description+"  "+evn.id+"   "+evn.name);


        EventImpl evnImpl = new EventImpl();
        System.out.println(evnImpl.create(33,"Pr","Dec").getId());

    }

}
