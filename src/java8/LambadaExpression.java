package java8;

import multithreading.AnonymousInnerClass;
import multithreading.AnonymousInnerClass1;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

/**
 * lambada expression->
 * anonymous function
 *
 * advantages->
 * it gives implementation to functional interface
 * it takes less code
 *
 * */

//public class LambadaExpression implements MyInterface6 {
//    public static void main(String[] args) {
//        MyInterface myInterface = () -> "Hello";
//
//        System.out.println(myInterface.display());
//
//        MyInterface2 myInterface2 = (a, b) -> {
//            return a + b;
//        };
//        System.out.println(myInterface2.add(3, 3));
//
//        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6);
//        Consumer<Integer> consumer = new Consumer<Integer>() {
//            @Override
//            public void accept(Integer integer) {
//                System.out.println(integer);
//            }
//        };
//        list.forEach(consumer);
//    }
////    @Override
////    public String str(){
////        return null;
////    }
//
//
//    @Override
//    public String Str() {
//        return null;
//    }
//}
//interface MyInterface{
//    String display();
//
//
//
//}
//interface MyInterface2{
//    Integer add(Integer a,Integer b);
//}
