import java.util.Scanner;

public class Task4If {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);



        System.out.print("Podaj imie: ");
        String name = scanner.nextLine();

        if(name.endsWith("a")){
            System.out.println("Jestes kobieta");
        }else{
            System.out.println("Jestes facetem");
        }
    }
}
