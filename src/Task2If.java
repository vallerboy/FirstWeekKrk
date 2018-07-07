import java.util.Scanner;

public class Task2If {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Wprowadź liczbe: ");
        int someInt = Integer.parseInt(scanner.nextLine());

        if(someInt % 3 == 0) {
            System.out.println("Jest podzielna przez 3");
        }else{
            System.out.println("Nie jest");
        }
    }
}
