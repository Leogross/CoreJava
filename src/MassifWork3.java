import java.util.Scanner;

public class MassifWork3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        System.out.println();

        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = i;
            if (a[i] / 2 == 0)
                k++;
        }
        System.out.println(k);
    }
}
