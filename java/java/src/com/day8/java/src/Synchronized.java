class Thread1 implements Runnable{
    public synchronized void run(){
        for(int j=0;j<10;j++){
            System.out.println(j+"->"+Thread.currentThread().getName());
            try {
                Thread.currentThread().sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        }
    }

public class Synchronized {
    public static void main(String[] args) {

        Thread1 t = new Thread1();
       Thread t1 =new Thread(t);
       Thread t2 =new Thread(t);
       Thread t3 =new Thread(t);
       t1.start();
       t2.start();
       t3.start();
    }
}




