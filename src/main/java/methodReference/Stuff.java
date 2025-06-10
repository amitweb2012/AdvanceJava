package methodReference;

public class Stuff {
    public static void doSuff() {
        System.out.println("Doing stuff");
    }

    public static void threadStuff() {
        for(int i=1; i<=10; i++) {
            System.out.println(i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
