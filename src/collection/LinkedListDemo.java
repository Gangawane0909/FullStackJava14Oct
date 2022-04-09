package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {
    public static void main(String[] args) {

        /**
         * Linked List stores duplicate value.
         * Linked list maintain insertion value.
         * Linked list use doubly linked list to store element.
         */

        LinkedList<Integer> list = new LinkedList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);

        System.out.println(list.hashCode());// hashcode means address//all object to hash code in linked list

        Iterator<Integer> iterator= list.descendingIterator();

        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
