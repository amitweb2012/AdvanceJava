package serializationPkg;

import java.io.*;

public class Main {
    // Seriallized: change state of object to byteStream, It has been useful for send data over
    // network, data store in file, data store in database
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Student std = new Student("Amit", "amit@gmail.com", 23, "Test address");
        FileOutputStream fileOutputStream = new FileOutputStream("src/main/java/serializationPkg/student.txt");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(std);
        objectOutputStream.close();
        fileOutputStream.close();
        // Deseriallized: change byteStream to object
        FileInputStream fileInputStream = new FileInputStream("src/main/java/serializationPkg/student.txt");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        Student readStudentData = (Student) objectInputStream.readObject();
        System.out.println(readStudentData);
        objectInputStream.close();
        fileInputStream.close();
    }
}
