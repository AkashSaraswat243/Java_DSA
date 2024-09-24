import java.util.*;

public class prime_show {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.close();
        boolean isprime = true;

        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                isprime = false;
            }
        }
        if (isprime == true) {
            System.out.println("Prime number");
        } else {
            System.out.println("Not prime number");
        }
    }
}