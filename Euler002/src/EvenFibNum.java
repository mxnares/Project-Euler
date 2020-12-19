public class EvenFibNum {
    public static void main(String[] args) {
        int sum = 0;
        int a = 1;
        int b = 2;
        int c = 0;
            while (a <= 4000000) {
                if (a%2 == 0) {
                    sum = sum + a;
                }
                c = a;
                a = b;
                b = c + b;

            }
        System.out.println(sum);
    }
}
