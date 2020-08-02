import java.util.Scanner;

public class Array8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("n=");
        int n = in.nextInt();
        double sum = 0;
        double mult = 1;
        for (int i = 0; i < n; i++){
            System.out.print("value:");
            double k = in.nextDouble();
            sum += k;
            mult *= k;
        }
        System.out.println(sum);
        System.out.println(mult);
    }
}
