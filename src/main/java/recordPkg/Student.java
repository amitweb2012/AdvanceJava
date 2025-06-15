package recordPkg;

public record Student(String name, String email, int age, String address) {

    public void displayName() {
        System.out.println("Show name " + name);
    }
}
