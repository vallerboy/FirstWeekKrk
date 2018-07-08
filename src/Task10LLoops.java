public class Task10LLoops {
    public static void main(String[] args) {
//
//        int n = 8;
//        //determinowanie linijki
//        for(int i = 0; i < n; i++){
//            //wypisywanie gwiazdek
//            for(int x = 0; x < i; x++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }



        int n = 40;
        for (int i = n; i >= 0; i--) {
            for(int i1 = 0; i1 < n - i; i1++){
                System.out.print(" ");
            }
            for (int i1 = 0; i1 < (i * 2) - 1; i1 ++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
