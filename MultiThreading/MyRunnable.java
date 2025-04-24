package MultiThreading;

class MyRunnable implements Runnable{
    public void run(){
        System.out.println("Thread is running through Runnable interface");
    }

    public static void main(String[] args){
        MyRunnable r = new MyRunnable();
        Thread t1 = new Thread(r);
        t1.start();
    }
}
