package constructorRefrefence;

public class Main {
    public static void main(String[] args) {

//        ConstRef constructorRef = () -> {
//            return new Student();
//        };
        ConstRef constructorRef = Student::new;
        Student student = constructorRef.getStudent();
        student.display();
    }
}
