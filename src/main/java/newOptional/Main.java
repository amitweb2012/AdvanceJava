package newOptional;

import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        String str = null;
        Optional<String> optional = Optional.ofNullable(str);
        System.out.println(optional.isPresent());
        System.out.println(optional.orElse("No value of str"));

        Optional<String> name = getName("Amit");
        System.out.println(name.orElse("No value found"));
    }

    public static Optional<String> getName(String str) {
        return Optional.ofNullable(str);
    }
}
