package sec9;

import java.util.Arrays;
import java.util.Scanner;

public class SortedArray {

    public static void main(String[] args) {

        int[] array = getIntegers(5);
        printArray(array);
        System.out.println();
        int[] newArray = sortIntegers(array);
        printArray(newArray);
    }

    public static int[] getIntegers(int size) {

        Scanner scanner = new Scanner(System.in);
        System.out.printf("Enter %d space separated numbers: ", size);
        String input = scanner.nextLine();

        String[] splits = input.split(" ");

//        int[] values = new int[array.length];
        int[] values = new int[size];

        for (int i = 0; i < values.length; i++) {
            values[i] = Integer.parseInt(splits[i].trim());
        }

        return values;
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.printf("Element %d contents %d%n", i, array[i]);
        }
    }

    public static int[] sortIntegers(int[] array) {

        int[] newArray = Arrays.copyOf(array, array.length);

        for (int i = 0; i < newArray.length - 1; i++) {
            for (int j = i+1; j < newArray.length; j++) {
                if (newArray[i] < newArray[j]) {
                    int temp = newArray[i];
                    newArray[i] = newArray[j];
                    newArray[j] = temp;
                }
            }
        }
        return newArray;
    }
}
