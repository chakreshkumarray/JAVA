package Streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TerminalOperations {
    public static void main(String[] args) {

        // 1. Collect
        List<Integer> list = Arrays.asList(1,4,3,8);
        list.stream().skip(1).toList();
        list.stream().skip(2).collect(Collectors.toList());

        // 2. For Each
        list.stream().forEach(x -> System.out.println(x));
        list.forEach(System.out::println);

        // 3. Reduce
        Optional<Integer> optionalInteger = list.stream().reduce((x, y)-> x+y);
        Optional<Integer> optionalInteger1 = list.stream().reduce(Integer::sum);
        System.out.println(optionalInteger.get());

        // 4. Count

        // 5. Any Match , All Match , None Match
        boolean b = list.stream().anyMatch(x -> x % 2 == 0 );
        System.out.println(b);
        boolean b1 = list.stream().allMatch(x -> x > 0);
        System.out.println(b1);
        boolean b2 = list.stream().noneMatch(x -> x < 0);
        System.out.println(b2);

        // 6. Find First , Find Any
        System.out.println(list.stream().findFirst().get());
        System.out.println(list.stream().findAny().get());

        // 7. toArray
        Object[] array = Stream.of(1,2,3).toArray();

        // 8. Min / Max
        System.out.println("Max: "+Stream.of(2,56,89,76).max(Comparator.naturalOrder()));
        System.out.println("Min: "+Stream.of(21,6,8,16).min(Comparator.naturalOrder()));

        // 9. For Each Order
        List<Integer> numbers1 = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        System.out.println("For each");
        numbers1.parallelStream().forEach(System.out::println);
        System.out.println("Ordered");
        numbers1.parallelStream().forEachOrdered(System.out::println);

        // Example : Filtering and Collecting Names
        List<String> names = Arrays.asList("Chakra","Ambushers","Dheeraj","Shiva","Shubham");
        System.out.println(names.stream().filter(x -> x.length() > 3).toList());

        // Example : Squaring and Sorting Numbers
        List<Integer> numbers = Arrays.asList(1,2,3,8,6,9);
        System.out.println(numbers.stream().map(x -> x*x).sorted().toList());

        // Example : Summing Values
        List<Integer> sum = Arrays.asList(1,2,3,8,6,9);
        System.out.println(sum.stream().reduce(Integer::sum));

        // Example : Counting Occurrences of a Characters
        String sentences = "Chakra Kumar";
        System.out.println(sentences.chars().filter(x -> x == 'C').count());

        // stateful and stateless operations

        // Example
        Stream<String> stream = names.stream();
        stream.forEach(System.out::println);
        //System.out.println(stream.map(String::toUpperCase).toList());
    }
}

