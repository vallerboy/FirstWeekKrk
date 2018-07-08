public class Task12Loops {
    public static void main(String[] args) {
        String word = "kajak";

        boolean isPalindrome = true;
        for (int i = 0; i < word.length(); i++) {
            if(word.charAt(i) != word.charAt(word.length() - i - 1)){
                isPalindrome = false;
                break;
            }
        }

        if(isPalindrome){
            System.out.println("to jest palindrome");
        }else{
            System.out.println("nie jest");
        }


        //////
        if(word.equals(new StringBuilder(word).reverse().toString())){
            System.out.println("palindrom");
        }
    }
}
