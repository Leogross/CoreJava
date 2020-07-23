import java.util.Scanner;

public class MassifWors4 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        System.out.println();

        int[] a = new int[n];
        for (int i = 2; i < n; i++) {
            a[i] = i;
            if (a[i] > a[i-1])
                k++;
        }
        System.out.println(k);
    }
}
