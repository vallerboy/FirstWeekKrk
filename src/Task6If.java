import java.util.Scanner;

public class Task6If {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        if (a < b && a < c) {
            System.out.println("A");
        } else if ( b < c) {
            System.out.println("B");
        }else{
            System.out.println("C");
        }

    }
}
