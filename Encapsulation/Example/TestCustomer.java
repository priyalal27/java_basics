public class TestCustomer {


    public static void main(String[] args) {
        
        customer c= new customer();
        c.setCreditcard("1111111");
        c.setFirstName("Priya");
        c.setLastName("Lal");

        System.out.println(c.creditcard+"   "+c.firstName+"    "+c.lastName);

    }
}

