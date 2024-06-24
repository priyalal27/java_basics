public class testCustomImmutable {
    

    public static void main(String[] args) {
        CustomImmutableClass m1 = new CustomImmutableClass(22);
        CustomImmutableClass m2 = m1.ImmutableChange(33);
        System.out.println(m1==m2);
        
    }
}
