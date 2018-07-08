public class Task9Loops {
    public static void main(String[] args) {
        int n = 9;

        int sum = 1;
        for (int i = 2; i <= n; i++) {
             sum *= i;
        }
        System.out.println(sum);
    }
}
