public class Developer extends Employee{

    String [] technology;

    public Developer(int id, String name, double salary, String[] technology) {
    
        super(id, name, salary);
        this.technology= technology;
    }

    
    @Override
    public void work(){
        System.out.println("developers work"+ projects);
    }

}
