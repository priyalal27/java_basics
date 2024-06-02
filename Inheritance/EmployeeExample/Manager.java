public class Manager extends Employee{

    String []   projects;

    public Manager(int id, String name, double salary, String[] projects) {
        super(id, name, salary);   
        this.projects = projects;
    }
    @Override
    public void work(){
        System.out.println("manager work"+ projects);
    }



}
