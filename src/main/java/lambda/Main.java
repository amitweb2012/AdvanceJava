package lambda;

public class Main{
    public static void main(String[] args) {

        Emp emp = () -> {
            System.out.println("Student Class");
        };
        emp.studentClass();
        Runnable thread1 = () -> {
            for(int i = 1; i<=10; i++) {
                System.out.println(i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        };

        Thread t = new Thread(thread1);
        t.setName("JOHN");
        t.start();
    }
}
