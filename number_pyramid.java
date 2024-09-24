import java.util.Scanner;

public class number_pyramid {
    public static void pyrdmid(int totRows) {
        // outer loop
        for (int i = 1; i <= totRows; i++) {
            // space print
            for (int j = 1; j <= ((totRows) - i); j++) {
                System.out.print(" ");
            }
            // number print
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println("");
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        sc.close();

        pyrdmid(rows);
    }
}
