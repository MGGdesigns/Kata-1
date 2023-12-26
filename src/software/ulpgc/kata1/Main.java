package software.ulpgc.kata1;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("Mauro", LocalDate.of(2003, 4, 1));
        System.out.println(person);
    }
}
