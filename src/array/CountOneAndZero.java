package array;

public class CountOneAndZero {
    public static void main(String[] args) {
        int i = 101100;
        Integer integer = new Integer(i);

        Integer integer1 = new Integer(10);
        int j = integer1;

        int k = 1010000;
        Integer k1 = new Integer(k);
        char[] chars = k1.toString().toCharArray();

        int countOne = 0, countZero = 1;
        for (int l = 0; l < chars.length; l++) {
            if (chars[l] == '1') {
                countOne++;
            } else {
                countZero++;
            }

        }
        System.out.println("One=>" + countOne);
        System.out.println("Zero=>" + countZero);
    }

}


