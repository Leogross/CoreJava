import java.util.Scanner;

public class Array2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        int [] arr = new int [n];
        //System.out.println("False");
        boolean isExist = false;

        for (int i = 0; i < n; i++){
            arr [i] = (int)(Math.random()*10);
            System.out.println(arr[i]);
            if (arr[i] < k){
                isExist = true;

            }
        }
        //System.out.println(isExist);
        if(isExist) {
            System.out.println("yes");
        }else {
            System.out.println("no");
        }
    }
}

