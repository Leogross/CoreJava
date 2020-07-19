import java.util.Scanner;

public class ListPowersTwo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int k = in.nextInt();
        int i = 1;
        double result = Math.pow(2, i);// 2^1,
        while (result < k){
            System.out.println((int)result);
            i++;
            result = Math.pow(2, i);
        }
    }
}
