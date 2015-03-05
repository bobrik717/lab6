package Пример1;

public class MyThread implements Runnable{

    public Thread thread;
    public volatile boolean cancel = false;

    public MyThread(){
        this.thread = new Thread(this);
    }

    @Override
    public void run(){
        double d = 9999.0;
        try{
            for (int i = 0; i < 30; i++){
                if ( this.cancel ) throw new InterruptedException("Принудительное завершение цикла");
                for (int j = 0; j < 1000000; j++) d = d * d / d;
                System.out.println("Name = " + Thread.currentThread().getName() + ", i = " + i + " d = " + d);
            }
        }catch (InterruptedException e){
            System.out.println(e.getMessage());
        }
    }
}
