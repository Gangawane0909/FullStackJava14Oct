package controlstatements;

public class DuplicateElement {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,5,6,7,8,1};

        for(int i = 0; i<arr.length; i++) {
            for(int j = i + 1; j < arr.length; i++){
                if(arr[i] == arr[j]) {
                    System.out.println(arr[i]);

                }
            }
        }
    }
}