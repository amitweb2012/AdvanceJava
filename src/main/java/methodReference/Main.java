package methodReference;

public class Main {
    public static void main(String[] args) {
        WorkInterRef innerRef = Stuff::doSuff;
        innerRef.doWork();

        Runnable thread1 = Stuff::threadStuff;
        Thread d = new Thread(thread1);
        d.start();
    }
}
