import java.util.Scanner;

public class rhombus {
    public static void rhombus_pattern(int totRows) {
        // outer loop
        for (int i = 1; i <= totRows; i++) {
            // space print
            for (int j = 1; j <= ((totRows) - i); j++) {
                System.out.print(" ");
            }
            // star print
            for (int k = 1; k <= totRows; k++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        sc.close();

        rhombus_pattern(rows);
    }
}
