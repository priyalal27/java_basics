public class MacBookPro extends MacBook{

    @Override
    public void start(){
        System.out.println("Starting Child Class MacBookPro");
    }

    @Override
    public void stop(){
        System.out.println("stopping Child Class MacBookPro");
    }


    public void ProsMethod(){
        System.out.println("Inside MacBook specific Pro Method");
    }

}
