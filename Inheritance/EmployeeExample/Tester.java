public class Tester extends Employee{

    String[] tools ;

    public Tester(int id, String name, double salary, String[] tools) {
        super(id, name, salary);
        this.tools=tools;
    }

    
    @Override
    public void work(){
        System.out.println("tester work"+ tester);
    }




}
