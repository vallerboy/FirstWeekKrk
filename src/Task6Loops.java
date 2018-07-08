import java.util.Scanner;

public class Task6Loops {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int winnerNumber = 123;

        int typedNumber;
        do{
            System.out.print("Podaj liczbe: ");
            typedNumber  = scanner.nextInt();

            if(typedNumber > winnerNumber){
                System.out.println("Celuj nizej");
            }else if(typedNumber < winnerNumber){
                System.out.println("Celuj wyzej");
            }
        }while (typedNumber != winnerNumber);
    }
}
