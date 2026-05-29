public class Runnable2 {
    public static void main(String[] args) {
        Thread t1  = new Thread( new InnerRunnable("Tushar Tanwar "));
        Thread t2  = new Thread( new InnerRunnable("Pratiksha "));

        t1.start();
        t2.start();
        
    }
}
