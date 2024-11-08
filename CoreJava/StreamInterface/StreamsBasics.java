package CoreJava.StreamInterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class StreamsBasics {
    public static void main(String[] args) {
        List<Integer> num = Arrays.asList(45, 23, 2, 1, 122);
        Stream<Integer> s1 = num.stream();
        // s1.forEach(v -> System.out.println(v));
        // s1.forEach(v -> System.out.println(v)); This gives and runtime error as
        // "stream has already been operated upon or closed"

        // case:1
        Stream<Integer> s2 = num.stream();

        Predicate<Integer> p = new Predicate<Integer>() {

            @Override
            public boolean test(Integer n) {
                return n % 2 == 0;
            }

        };

        Function<Integer, Integer> f = new Function<Integer, Integer>() {

            @Override
            public Integer apply(Integer n) {
                return n * 2;
            }
        };
        Stream<Integer> s3 = s1.filter(p);
        Stream<Integer> s4 = s3.map(f);
        int result = s4.reduce(0, (a, c) -> a + c);
        System.out.println(result);

        // case 2:
        Stream<Integer> s5 = num.stream();
        Stream<Integer> s6 = s5.filter(n -> n % 2 == 0);
        Stream<Integer> s7 = s6.map(n -> n * 2);
        int result2 = s7.reduce(0, (a, c) -> a + c);
        System.out.println(result2);

        // case 3:
        int result3 = num.stream().filter(n -> n % 2 == 0).map(n -> n * 2).reduce(0, (a, c) -> a + c);
        System.out.println(result2);

        // case 4:
        int result4 = Arrays.asList(45, 23, 2, 1, 122).stream().filter(n -> n % 2 == 0).map(n -> n * 2).reduce(0,
                (a, c) -> a + c);
        System.out.println(result4);

        // case 5: sorting
        Stream<Integer> sortedList = Arrays.asList(45, 23, 2, 1, 122,6,8,3,5,22,44).stream().filter(n -> n % 2 == 0).sorted();
        sortedList.forEach(v -> System.out.println(v));
    }
}
