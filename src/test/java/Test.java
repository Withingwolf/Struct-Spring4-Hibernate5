public class Test {
    static int num;

    public static void hano(int n, int a, int b, int c) {
        if (n == 1) {
            num++;
            return;
        }
        hano(n - 1, a, c, b);
        num++;
        hano(n - 1, b, a, c);
    }

    public static void main(String[] args) {
        hano(6, 0, 1, 2);
        System.out.println(num);
    }

}
