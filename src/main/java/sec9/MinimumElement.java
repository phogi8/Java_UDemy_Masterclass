package sec9;

import java.util.Arrays;
import java.util.Scanner;

public class MinimumElement {

    public static void main(String[] args) {
        int size = readInteger();
        System.out.println(size);
        int[] array = readElements(size);
        System.out.println(Arrays.toString(array));
        int min = findMin(array);
        System.out.println(min);
    }

    public static int readInteger() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter elements count: ");
        String input = scanner.nextLine();
        int size = Integer.parseInt(input.trim());
        return size;
    }

    public static int[] readElements(int size) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Enter %d space separated numbers: ", size);
        int[] values = new int[size];
        for (int i = 0; i < size; i++) {
            values[i] = Integer.parseInt(scanner.nextLine().trim());
        }
        return values;
    }

    public static int findMin(int[] array) {
        int min = Integer.MAX_VALUE;
        for (int item : array) {
            if (min > item) {
                min = item;
            }
        }
        return min;
    }

}
