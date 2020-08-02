import java.util.Scanner;

public class Array5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("n:");
        int n  = in.nextInt();
        System.out.println();
        int min = 1000;
        boolean isExist = false; //переменная флаг
        for (int i = 0; i < n; i++){
            System.out.println("car:");
            int car = in.nextInt();//20
            if (car < min){
                min = car;
            }
            if (car > 80){
               isExist = true;
            }
        }
        System.out.println(min);
        if (isExist){
            System.out.println("yes");
        }else{
            System.out.println("No");
        }
    }
}
