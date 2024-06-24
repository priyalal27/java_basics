public class MultiThreadExample extends Thread{

    public void run(){
 
        for(int i = 0; i < 100 ; i++){
            System.out.print("i : "+i);
        }


    }

     public static void main(String[] args) throws InterruptedException {
        
        MultiThreadExample mte = new MultiThreadExample();
        mte.start();            
        for(int i = 0; i < 100 ; i++){
            System.out.print("j : "+i);
            Thread.sleep(500);
        }


     }

     /*Main method is seperate thread and run() is a seperate thread .
      * execution switches between these two threads .
      */


}
