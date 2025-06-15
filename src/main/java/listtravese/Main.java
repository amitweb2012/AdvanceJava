package listtravese;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {
        List<String> listStr = new ArrayList<>();
        listStr.add("JOHN");
        listStr.add("PETER");
        listStr.add("JULIA");
        listStr.add("NEELA");

        // simple forloop where we can find index not for set, map, tree
        System.out.println("SIMPLE FOR LOOP");
        for(int i=0; i<=listStr.size()-1; i++) {
            System.out.println(listStr.get(i));
        }
        System.out.println("+++++++++++++++++++");

        // enhanced forloop for list, arraylist, vector
        System.out.println("ENHANCED FOR LOOP");
        for(String str: listStr) {
            System.out.println(str);
        }
        System.out.println("+++++++++++++++++++");

        // Iterator for list for forward direction traverse
        System.out.println("Iterator Loop");
        Iterator<String> iterator = listStr.iterator();
        while(iterator.hasNext()) {
            String element= iterator.next();
            System.out.println(element);
        }
        System.out.println("+++++++++++++++++++");

        // ListIterator for list for forward and backward direction traverse
        System.out.println("ListIterator forward");
        ListIterator<String> listIterator = listStr.listIterator();
        while(listIterator.hasNext()) {
            String element= listIterator.next();
            System.out.println(element);
        }
        System.out.println("+++++++++++++++++++");

        System.out.println("ListIterator Backward");
        ListIterator<String> listIterator2 = listStr.listIterator(listStr.size());
        while(listIterator2.hasPrevious()) {
            String element1= listIterator2.previous();
            System.out.println(element1);
        }
        System.out.println("+++++++++++++++++++");

        // simple foreach loop
        System.out.println("Simple foreach loop");
        listStr.forEach(element -> {
            System.out.println(element);
        });
        System.out.println("+++++++++++++++++++");

        // simple foreach loop using stream api
        System.out.println("Stream API foreach loop");
        listStr.stream().forEach(element-> {
            System.out.println(element);
        });
        System.out.println("+++++++++++++++++++");
    }
}
