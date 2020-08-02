import java.util.Scanner;

public class Array7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println();
        int k = 0;
        for (int i = 0; i < n; i++){
            int x  = in.nextInt();
            if (x % 3 == 0){
                k++;
            }
        }
        System.out.println(k);
    }
}
