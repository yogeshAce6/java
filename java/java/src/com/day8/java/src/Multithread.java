public class Multithread {
    public static void main(String[] args){
        Runnable r1 = ()-> {
            for(int i=0;i<=20;i++){
                System.out.println(i);
            }

        };
        Runnable r2 = ()-> {
            for (int i = 0; i <= 20; i++) {
                System.out.println(i);
            }
        };

        Thread t1 = new Thread(r1);
        Thread t2 = new Thread(r2);
        t1.start();
        t2.start();
        try {
            t1.join();
        }catch(InterruptedException e){
            throw new RuntimeException(e);
        }
        try {
            t2.join();
        }catch(InterruptedException e){
            throw new RuntimeException(e);
        }
        System.out.println("Last line of main method");
    }
}
