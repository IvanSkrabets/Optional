import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
////        Human human = new Human(15, "test");
////        Optional <Human> optionalHuman = Optional.of(human);
////      optionalHuman.ifPresent(value -> System.out.println(value));
////        System.out.println(optionalHuman.get());
////        System.out.println(optionalHuman.isPresent());
////        optionalHuman = Optional.empty();
////        System.out.println(optionalHuman.orElse(new Human(15, "DSsd")));
////        Optional<Human> human = returnSomeValue();
////        if (human.isPresent()){
////            Human human1 = human.get();
////            System.out.println(human1);
////        }
////        human.ifPresent(value -> System.out.println(value));
//        Optional<Human> optionalHuman = returnSomeValue();
//        if(optionalHuman.isPresent()){
//            Human human = optionalHuman.get();
//            System.out.println(human);
//        } else {
//            System.out.println("Обертка пустая");
//        }
//    }

//    public static Optional<Human> returnSomeValue() {
////        Human human = new Human(12365, "dfsgfs");
//        return Optional.ofNullable(null);
//    }



//        ArrayList<Integer> list = new ArrayList<>();
//        list.add(4);
//        list.add(54);
//        list.add(454);
//        list.add(1);
//        list.add(24);

//        list.stream()
//                .filter(value -> value > 10 )
//                .forEach(value -> System.out.println(value));

//       List<Integer> collect = list.stream()
//                .filter(value -> value > 10 )
//                .skip(1)
//                .collect(Collectors.toList());
//        System.out.println(collect);

//        list.stream()
//                .distinct()
//                .forEach(vale -> System.out.println(vale));

//        list.stream()
//                .sorted()
//                .forEach(System.out::println);



//       Optional<Integer> min = list.stream()
//                .min(((o1, o2) -> o1.compareTo(o2)));
//
//        System.out.println(min.get());

        Home home = new Home();
        home.randomValue();
    }
}
