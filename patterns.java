import java.util.Scanner;

public class patterns {
    public static void hallow_rectangel(int totRows, int totcols) {
        // Outer loops
        for (int i = 1; i <= totRows; i++) {
            // inner loops
            for (int j = 1; j <= totcols; j++) {
                if (i == 1 || i == totRows || j == 1 || j == totcols) {
                    //boundry cells
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();
        sc.close();

        hallow_rectangel(row, col);
    }
}