public class ExceptionDemo {


    public static void main(String[] args) throws InterruptedException,Exception {
        Thread.sleep(1000);

        throw new MyThreadException("checking");
    }

}
