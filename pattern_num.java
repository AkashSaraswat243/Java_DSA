import java.util.Scanner;

public class pattern_num {
    public static void pattern(int totRows) {
        // outer loop
        for (int i = 1; i <= totRows; i++) {
            // print numbers
            for (int j = 1; j <= ((totRows - i) + 1); j++) {
                System.out.print(j);
            }
            // print space
            for (int k = 1; k <= (totRows - (totRows - i) + 1); k++) {
                System.out.print(" ");
            }
            System.out.println("");
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        sc.close();

        pattern(rows);
    }
}
