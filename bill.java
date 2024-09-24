import java.util.Scanner;

public class bill {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        float a_pencil = sc.nextInt();
        float a_pen = sc.nextInt();
        float a_eraser = sc.nextInt();

        float total_cost = (a_eraser + a_pencil + a_pen);
        sc.close();

        System.out.println(total_cost);

        // Adding 18% gst bill

        float new_total_cost = total_cost + (0.18f * total_cost);
        System.out.println(new_total_cost);
    }
}
