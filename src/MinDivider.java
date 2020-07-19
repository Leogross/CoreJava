import java.util.Scanner;

public class MinDivider {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int k = in.nextInt();

        for (int i = 2; i <= k/2; i++){// 6 -> 2 3
            if (k % i == 0) {
                System.out.println(i);
                break;
            }
        }
        System.out.println("END");
    }
}
