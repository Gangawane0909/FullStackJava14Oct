package java8;

import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * stream api - it is sequence of object and have multiple methods, and we combine that method and produce desire result.
 *
 * types of stream api  - sequential and parallel(multithreading)
 *
 * operations-
 * terminal - forEach(consumer),collect(),reduce()
 * intermediate - map(function),filter(predicate),sorted()
  */

public class StreamApi {
    public static void main(String[] args) {

        List<Integer>list= Arrays.asList(1,2,3,4,5,6);

        Function<Integer,Integer>function = f->f*2;
        Stream<Integer> list1 = list.stream().map(function);
        list1.forEach(System.out::println);

        Predicate<Integer>predicate = p->p%2==0;
        Stream<Integer> list2 = list.stream().filter(predicate);
        list2.forEach(System.out::println);

        Arrays.asList("pune","Mumbai","Karjat")
                .stream()
                .map(f->f.toLowerCase())
                .forEach(System.out::println);

        List<Integer> list3 = Arrays.asList(1,3,3,4,5,6,66);

        int max = 0;
        for (int i= 0;i<list3.size();i++){
            if(max<list3.get(i)){

            }
        }
        System.out.println(max);

        System.out.println(IntStream.of(1,3,3,4,5,6,66).limit(9).max());





    }
}
