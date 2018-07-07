import java.util.Scanner;

public class Task1If {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Wprowadź liczbe: ");
        int someInt = Integer.parseInt(scanner.nextLine());

        if(someInt >= 5) {
            System.out.println("Liczba jest wieksza lub równa  5");
        }else{
            System.out.println("LIczba jest mniejsza");
        }
    }
}
