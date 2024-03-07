package sec9;

import java.util.Arrays;

public class ReverseArray {

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        reverse(array);

        array = new int[] {1, 2, 3, 4, };
        reverse(array);
    }

    private static void reverse(int[] array) {
        System.out.print("Array = ");
        System.out.println(Arrays.toString(array));
        int size = array.length;
        int end = size - 1;
        int mid = size / 2;
//        System.out.println(size + " " + max + " " + mid);

        for (int i = 0; i < mid; i++) {
            int temp = array[i];
            array[i] = array[end - i];
            array[end - i] = temp;
//            System.out.println(Arrays.toString(array));
        }
        System.out.print("Reversed array = ");
        System.out.println(Arrays.toString(array));
    }


}
