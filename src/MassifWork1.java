import java.util.Scanner;

public class MassifWork1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int k = in.nextInt();
        int i = in.nextInt();
        System.out.println();

        int[] n = new int[k];
        for (i = 0; i < k; i += 2) {
            n[i] = i;
            System.out.println(i);
        }
    }
}