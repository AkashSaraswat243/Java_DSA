import java.util.Scanner;

public class floyed_triangle {
    public static void floyed(int totRows) {
        int count =1;
        // outer loop
        for (int i = 1; i <= totRows; i++) {
            // number print
            for (int j = 1; j <= i; j++) {
                System.out.print(count+" ");
                count++;
            }
            System.out.println("");
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        sc.close();

        floyed(rows);
    }
}
