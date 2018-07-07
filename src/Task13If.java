import java.util.Scanner;

public class Task13If {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        if(a % 3 == 0 || a % 5 == 0){
            System.out.println("tak jest podzielna");
        }else{
            System.out.println("Nie nie jest podzielna");
        }
    }
}
