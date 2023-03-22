import java.text.CollationElementIterator;
import java.util.*;
import java.util.stream.Collectors;

public class Home {
    Random random =new Random();

    public void randomValue (){
        ArrayList <Integer> list = new ArrayList<>();
        int a = 10;
        for (int i = 0; i < a; i++){
           list.add(random.nextInt(10, 25));
        }
        System.out.println(list);
//        list.stream()
//                .filter(value -> value % 2 == 0)
//                .forEach(System.out::print);
//
//        System.out.print("+++++++++++++++++++++++++");
//         list.stream()
//                .sorted()
//                 .forEach(System.out::println);
//        System.out.print("+++++++++++++++++++++++++");
//         list.stream()
//                 .sorted(Collections.reverseOrder())
//                 .collect(Collectors.toList())
//                 .forEach(System.out::println);

           Optional<Integer> min =  list.stream()
                    .min(((o1, o2) -> o1.compareTo(o2)));
           System.out.println(min.get());


            Optional<Integer> max =  list.stream()
                    .max(((o1, o2) -> o1.compareTo(o2)));
            System.out.println(max.get());


      list.stream()
                .filter(value -> value > 20  )
                .sorted()
                .forEach( value -> System.out.println(value*10));
        System.out.println("++++++++++++++++++++++++++");

      Optional<Integer> maximum = list.stream()
              .skip(5)
              .distinct()
              .max(((o1, o2) -> o1.compareTo(o2)));
        System.out.print(maximum.get());
        System.out.println("++++++++++++++++++++++++++");

       list.stream()
                .skip(5)
                .sorted(Collections.reverseOrder())
                 .collect(Collectors.toList())
                 .forEach(value -> System.out.print(value * 10 + 5 + " "));

    }
}
