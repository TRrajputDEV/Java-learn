public class Main {

    private final Object lock1 = new Object();
    private final Object lock2 = new Object();


    public void methodA(){

        synchronized(lock1){
            System.out.println("Thread 1: Holding Lock 1");
        
            synchronized(lock2){
                System.out.println("Thread 1: Holding thread 2");
            }
        
        
        }
    }


  public void methodB(){

        synchronized(lock2){
            System.out.println("Thread 2: Holding Lock 2");
        
            synchronized(lock1){
                System.out.println("Thread 2: Holding thread 1");
            }
        
        
        }
    }


    public static void main(String[] args) {
        Main example = new Main();
        new Thread(example::methodA).start();
        new Thread(example::methodB).start();
    }

    
}
