import java.util.*;

public class space_pattern {
    public static void rotate_pattern(int totRows) {
        // outer loop
        for (int i = 1; i <= totRows; i++) {
            // space print
            for (int j = 1; j <= ((totRows) - i); j++) {
                System.out.print(" ");
            }
            // star print
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        sc.close();

        rotate_pattern(row);
    }
}
