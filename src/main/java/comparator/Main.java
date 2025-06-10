package comparator;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Emp> empList = new ArrayList<>();
        empList.add(new Emp(120, "Amit", 1000));
        empList.add(new Emp(14, "Ratna", 2000));
        empList.add(new Emp(16, "Bishal", 3000));
//        Collections.sort(empList, new IdComparator());
//        System.out.println(empList);
        Collections.sort(empList, new NameComparator());
        System.out.println(empList);
    }
}
