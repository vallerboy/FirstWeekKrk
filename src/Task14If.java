import java.util.Scanner;

public class Task14If {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        if(a >= 18){
            System.out.println("Osoba jest pełnoletnia");
        }else{
            System.out.println("Osoba nie jest pełnoletnia");
        }
    }
}
