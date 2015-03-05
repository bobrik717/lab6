package Пример1;

public class Main {
    public static void main(String[] args) throws InterruptedException{
        System.out.println("Start");
        MyThread t1 = new MyThread();
        t1.thread.start();
        Thread.sleep(100);
        t1.thread.interrupt();
        t1.cancel = true;
        System.out.println("End");
    }
}
