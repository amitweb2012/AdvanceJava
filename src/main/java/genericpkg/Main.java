package genericpkg;

public class Main {
    public static void main(String[] args) {
        Student<String> student = new Student<String>("Amit");
        System.out.println(student);

        Student<Integer> student1 = new Student<Integer>(1980);
        System.out.println(student1);
    }
}
