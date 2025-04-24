package MultiThreading;

class MyRunnable2 implements Runnable {
    public void run(){
        for(int i=1; i<=5; i++){
            System.out.println(i);

            try{
                Thread.sleep(1000);
            } catch(Exception e){
                System.out.println(e);
            }
        }
    }

    public static void main(String[] args) {
        MyThread2 t = new MyThread2();
        Thread t1 = new Thread(t);
        t1.start();
    }
}
