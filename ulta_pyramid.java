import java.util.Scanner;

public class ulta_pyramid {
    public static void pyrad(int totRows) {
        // outer loop
        for (int i = 1; i <= totRows; i++) {
            // space print
            for (int j = 1; j <= (i - 1); j++) {
                System.out.print(" ");
            }
            // star print
            for (int k = 1; k <= ((totRows - i) + 1); k++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        sc.close();

        pyrad(rows);
    }
}
