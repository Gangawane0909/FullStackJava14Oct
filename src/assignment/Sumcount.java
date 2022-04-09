package assignment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
//Question= int[] arr = {103,23,45,545,55,101,102} sum of the counter for consecutive value
//interview question.
public class Sumcount {
    public static void main(String[] args) {
        int[] arr = {103,23,45,545,55,101,102};

        List<Integer> list = new ArrayList<>();
        for(int i=0; i< arr.length;i++){
            if(arr[i]>100){
                list.add(arr[i]);
            }
        }
        Collections.sort(list);
        System.out.println(list.get(0)+list.get(1));

        //2  OR
        List<Integer> list1 = Arrays.asList(103,23,45,545,55,101,102)
                .stream().filter(f->f>100).sorted().collect(Collectors.toList());

        System.out.println(list1.get(0)+list1.get(1));

    }
}
