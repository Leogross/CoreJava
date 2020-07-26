public class Array0 {
    public static void main(String[] args) {
        final int AMOUNT_ELEMENTS = 10;
        int[] m = new int[AMOUNT_ELEMENTS]; // 2 байта 20 байт
        int sum = 0;
        for (int i = 0; i < AMOUNT_ELEMENTS; i++){
            m[i] = (int) (Math.random() * 10) + 1; // (int)0.01 ->  [4byte][][][][]
            System.out.println(m[i]);
            sum += m[i];
        }
        System.out.println(sum);
    }
}
