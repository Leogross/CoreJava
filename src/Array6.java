import java.util.Scanner;

public class Array6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("n:");
        int n = in.nextInt();
        System.out.println();

        int sum = 0;
        boolean isExist = false;
        for (int i = 0; i < n; i++){
            System.out.println("car:");
             int car = in.nextInt();
             sum += car;
             if (car > 60){
                 isExist = true;
             }
         }
        double avg = (double)sum/n;// int/int -> int        , double/int -> double
        System.out.println(avg);
        System.out.println(isExist);
    }
}
