package comparable;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        ArrayList<Emp> empList = new ArrayList<>();
        empList.add(new Emp(120, "Amit", 1000));
        empList.add(new Emp(14, "Ratna", 2000));
        empList.add(new Emp(16, "Bishal", 3000));
        Collections.sort(empList);
        System.out.println(empList);
    }
}
