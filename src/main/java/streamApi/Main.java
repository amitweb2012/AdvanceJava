package streamApi;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Integer> newList=List.of(12, 45, 56, 7789, 456);
        System.out.println(newList);
        newList.stream().filter(e-> e % 2 == 0).forEach(item -> System.out.println(item));
        List<Integer> orderList = newList.stream().filter(e-> e % 2 == 0).collect(Collectors.toList());
        System.out.println(orderList);

        List<Emp> empList = new ArrayList<>();
        empList.add(new Emp(1, "Amit", 2300));
        empList.add(new Emp(2, "Shajal", 4500));
        empList.add(new Emp(3, "John", 5000));

        Optional<Emp> getMaxSalary = empList.stream().max(Comparator.comparingDouble(Emp::getEmpSalary));
        getMaxSalary.ifPresent(System.out::println);
    }
}
