import java.util.*;

public class diamond_pattern {
    public static void diamond(int totRows) {
        // first half loops
        for (int i = 1; i <= totRows; i++) {
            // space print
            for (int j = 1; j <= ((totRows) - i); j++) {
                System.out.print(" ");
            }
            // star print
            for (int k = 1; k <= ((2 * i) - 1); k++) {
                System.out.print("*");
            }
            System.out.println("");
        }

        // second half loop
        for (int i = totRows; i >= 1; i--) {
            // space print
            for (int j = 1; j <= ((totRows) - i); j++) {
                System.out.print(" ");
            }
            // star print
            for (int k = 1; k <= ((2 * i) - 1); k++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        sc.close();

        diamond(rows);
    }
}