import java.util.Scanner;
public class Task11Loops {
    public static void main(String[] args) {
          Scanner scanner = new Scanner(System.in);
//        for (int i = 0; i < word.length(); i++) {
////            if(Character.isDigit(word.charAt(i))){
////                System.out.println(word.charAt(i));
////            }
////        }

        int sum = 0;
        do {
            System.out.print("Podaj słowo: ");

            String word = scanner.nextLine();
            for (int i = 0; i < word.length(); i++) {
                if(Character.isDigit(word.charAt(i))){
                    sum++;
                }
            }
        }while (sum == 0);
        System.out.println("Ilosc cyfr w podanym wyrazie to: " + sum);

    }
}
