public class Task12If {
    public static void main(String[] args) {
        String word = "34-120";

        if(Character.isDigit(word.charAt(0)) &&
                Character.isDigit(word.charAt(1)) &&
                word.charAt(2) == '-' &&
                Character.isDigit(word.charAt(3)) &&
                Character.isDigit(word.charAt(4))) {
            System.out.println("Zgadza sie");
        }

        if(word.matches("[0-9]{2}-[0-9]{3}")){

        }

        System.out.println("asdasd");
    }
}
