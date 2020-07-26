import java.util.Scanner;

public class Array3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();

        int[] arr = new int[N];
        int sum = 0;
        int amount = 0;
        for (int i = 0; i < N; i++) {
            arr[i] = (int) (Math.random() * 10);
            System.out.println(arr[i]);
            sum += arr[i];
            if (arr[i] < 40) {
                amount += 1;
            }
        }
        double avg = (double) sum / N;
        System.out.println(avg);
        if (amount > 2) {
            System.out.println("yes");
        }else {
            System.out.println("No");
        }
    }
}
