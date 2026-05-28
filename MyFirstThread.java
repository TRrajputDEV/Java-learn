
public class MyFirstThread {
    public static void main(String[] args) {
        InnerMyFirstThread t1 = new InnerMyFirstThread();

        t1.start();

        System.out.print("The Main Program has finished starting the thread");
    }
}

