import java.util.Scanner;

public class Task16If {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();

        if((a >= 13 && a <= 16) && (b >= 13 && b <=16)){
            System.out.println("TAK");
        }else{
            System.out.println("NIE");
        }
    }
}
