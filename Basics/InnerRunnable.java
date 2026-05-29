package Basics;
public class InnerRunnable implements Runnable{
    private String task;

    InnerRunnable(String task){
        this.task = task;
    }

    public void run(){
        System.out.println(task +  "is being prepared by" + Thread.currentThread().getName());
    }
}
