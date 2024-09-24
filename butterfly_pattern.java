import java.util.Scanner;

public class butterfly_pattern {
    public static void butterfly(int totRows) {
        // first half
        for (int i = 1; i <= totRows; i++) {
            // star print
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // space print
            for (int k = 1; k <= (2 * (totRows - i)); k++) {
                System.out.print(" ");
            }
            // star print
            for (int l = 1; l <= i; l++) {
                System.out.print("*");
            }
            System.out.println("");
        }

        // Second half
        for (int i = totRows; i >= 1; i--) {
            // star print
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // space print
            for (int k = 1; k <= (2 * (totRows - i)); k++) {
                System.out.print(" ");
            }
            // star print
            for (int l = 1; l <= i; l++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        sc.close();

        butterfly(rows);
    }
}
