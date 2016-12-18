import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Common helpers
 * Created by denis on 18.12.16.
 */
class Helper {
    static int getUserInput(int start, int end) {
        int n;
        while (true) {
            n = getIntFromUser();
            if (n < start || n > end) {
                sayOutOfRangeError(start, end);
            } else {
                return n;
            }
        }
    }

    private static int getIntFromUser() {
        while (true) {
            try {
                Scanner in = new Scanner(System.in);
                return in.nextInt();
            } catch (InputMismatchException ex) {
                System.out.println("Please input number");
            }
        }
    }

    private static void sayOutOfRangeError(int start, int end) {
        if (start == end) {
            System.out.printf("Only %d allowed\n", start);
        } else {
            System.out.printf("Please input number from %d to %d\n", start, end);
        }
    }

    static double getDoubleFromUser() {
        while (true) {
            try {
                Scanner in = new Scanner(System.in);
                return in.nextDouble();
            } catch (InputMismatchException ex) {
                System.out.println("Please input number");
            }
        }
    }
}
