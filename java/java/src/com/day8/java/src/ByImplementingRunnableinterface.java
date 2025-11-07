
class Mythread implements Runnable{
    @Override
    public void run() {
        System.out.println("Mythread is running"+Thread.currentThread().getName());
    }
}

public class ByImplementingRunnableinterface {
    public static void main(String[] args) {
        Mythread t1 = new Mythread();
        t1.run();

    }
}
