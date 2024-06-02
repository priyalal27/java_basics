public class TestingClass {



    public static void main(String[] args) {
        String[] a= new String[]{"AAP","EA","APIn"};
        Manager m = new Manager(10, "Priya", 100000.0000,a);
        System.out.println(m.id);
        System.out.println(m.name);
        System.out.println(m.salary);

        for (int i = 0; i < a.length; i++) {
            System.out.println(m.projects[i]);

        }
            m.work();
    }
}
