package genericpkg;

public class Student<T> {
    private T name;

    public Student(T name) {
        this.name = name;
    }

    public T getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name=" + name +
                '}';
    }
}
