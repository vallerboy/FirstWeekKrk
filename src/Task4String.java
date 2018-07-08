public class Task4String {
    public static void main(String[] args) {
        String someWord = "12helo";

        if(Character.isDigit(someWord.charAt(0))){
            System.out.println("tak to cyfra");
        }else{
            System.out.println("nie to nie cyfra");
        }

        int a = 5;
        int b = 6;

        a = a + b; //11
        b = a - b; // 11 - 6 = 5;
        a = a - b; // 11 - 5 = 6;

        System.out.println(a + " " + b);
    }
}
