public class JoinMethodExample extends Thread{


    public int run(int n){
        int sum = 0; 
        for(int i = 0 ; i <= n ; i++){
            sum = sum + i ;
        }
        return sum ;
    }

    public static void main(String[] args) throws InterruptedException {
        JoinMethodExample jme = new JoinMethodExample();
        long start = System.currentTimeMillis();
        System.out.println(jme.run(9));
        jme.join();
        long end = System.currentTimeMillis();
        System.out.println("Total time taken to execute "+((end-start)));

    }

}

/*join(): When you invoke join(), the current thread pauses its 
execution and waits for the specified thread (the one on which join() is called) to complete. 
The current thread remains in the wait state until the specified thread finishes.
 If the specified thread is interrupted, it throws an InterruptedException.
*/