import java.util.Scanner;

public class Array4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = (int) (Math.random() * 10);
            System.out.println(arr[i]);
        }
        int amount = 0;
        for (int i = 0; i < N; i++) {
            if (arr[i] % 2 == 0) {
                System.out.println(i);
                amount += 1;
            }
        }
        System.out.println("amount=" + amount);
    }
}
