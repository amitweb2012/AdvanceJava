package dynamicproxy;

import java.lang.reflect.Proxy;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, String> fees = (Map<String, String>) Proxy.newProxyInstance(
                HashMap.class.getClassLoader(),
                new Class[]{Map.class},
                new ObjectHandler(new HashMap<>())
        );
        fees.put("java", "3000");
        fees.put("C++", "3000");
        System.out.println(fees);
        Short num= 5;
        Short num2= 7;
        Short result= (short) (num +num2);
        System.out.println(result);
    }
}
