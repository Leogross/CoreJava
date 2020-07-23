public class Integer11 {
    public static void main(String[] args) {
        int a, b, c, d, e, f;
        a = 234;
        c = a / 100;
        e = a % 10;
        d = (a / 10) % 10;
        b = c + e + d;
        f = c * e * d;
        System.out.println("сумма " + b);
        System.out.println("произведение " + f);
    }
}
