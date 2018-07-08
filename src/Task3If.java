import java.util.Scanner;

public class Task3If {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String text = scanner.nextLine();
        if(text.equals("Akademia")){
            System.out.println("Tak");
        }else{
            System.out.println("Nie");
        }
    }
}
