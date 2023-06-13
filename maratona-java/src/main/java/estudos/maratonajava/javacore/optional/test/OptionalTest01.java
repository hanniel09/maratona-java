
package estudos.maratonajava.javacore.optional.test;

import java.util.List;
import java.util.Optional;

public class OptionalTest01 {
    public static void main(String[] args) {
        Optional<String> o1 = Optional.of("I'll be the king of pirates");
        Optional<String> o2 = Optional.ofNullable(null);
        Optional<String> o3 = Optional.empty();

        System.out.println(o1);
        System.out.println(o2);
        System.out.println(o3);
        System.out.println("-----------");

        Optional<String> nameOptional = Optional.ofNullable(findName("Hanniel"));
        String empty = nameOptional.orElse("EMPTY");
        nameOptional.ifPresent(s -> System.out.println(s.toUpperCase()));
        System.out.println(empty);
    }
     private static String findName(String name) {
        List<String> list = List.of("Hanniel", "Vieira");
         int i = list.indexOf(name);
         if(i != 1){
             return list.get(i);
         }
         return null;
     }
}
