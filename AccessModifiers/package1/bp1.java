public class bp1 {

    private int aa = 10;
    int bb = 20;
    public int cc = 30;
    protected int dd = 40;

    public static void main(String[] args) {
        bp1 obj_b = new bp1();
        //System.out.println(obj_b.aa); // Compilation error
        System.out.println(obj_b.bb);
        //System.out.println(obj_b.cc); // Compilation error
        System.out.println(obj_b.dd);
    }

    // Public methods to access private and public variables
    public int getAa() {
        return aa;
    }

    public int getCc() {
        return cc;
    }
}
