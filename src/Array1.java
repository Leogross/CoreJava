import java.util.Scanner;

public class Array1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();//количество элементов в массиве

        int[] arr = new int[n]; //выделяем память под n 'лементов массива
        for (int i = 0; i < n; i++) {
            arr[i] = (int) (Math.random() * 10) - 2;
            System.out.println(arr[i]);
        }

        int k = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] > 0) {
                k += 1;
            }
        }
        if (k > 0) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }

    }
}
