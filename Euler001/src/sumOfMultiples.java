public class sumOfMultiples {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 0; i < 1000; i = i + 3) {
            sum = sum + i;
        }
        for (int j = 0; j < 1000; j = j + 5) {
            sum = sum + j;
        }
        for (int i = 0; i < 1000; i = i + 15) {
            sum = sum - i;
        }
        System.out.println(sum);
    }
}
