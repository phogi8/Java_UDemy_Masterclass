public class Udemy {
    public static void main (String[] args) {

        sumOdd(1, 11);


        printConversion(0.0);
    }

    public static long toMilesPerHour (double kilometersPerHour) {
        System.out.println("kilometersPerHour: " + kilometersPerHour);
        if (kilometersPerHour < 0) {
            return -1;
        } else {
            return Math.round(kilometersPerHour / 1.609);
        }
    }

    public static void printConversion (double kilometersPerHour) {
        if (kilometersPerHour < 0) {
            System.out.println("Invalid Value");
        } else {
            System.out.println(kilometersPerHour + " km/h = " + toMilesPerHour(kilometersPerHour) + " mi/h");
        }
    }

    public static boolean isOdd (int number) {
        if (number <= 0) {
            return false;
        }

        if (number % 2 != 0) {
            return true;
        }

        return false;
    }

    public static int sumOdd (int start, int end) {
        int sum = 0;

        if (start > end || start < 0 || end < 0) {
            return -1;
        }

        for (int i = start; i > end; i++) {
            sum += isOdd(i) ? i : 0;
        }

        return sum;
    }
}