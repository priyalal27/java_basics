public class osmTest {

    public static void main(String[] args) {
        osmChild.testStatic();
        osmParent.testStatic();

        osmParent c1 = new osmChild();
        System.out.println(c1.parent_var);
    }

}
