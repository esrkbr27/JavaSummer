package day17_NestedForLoop;

public class C06_nestedForLoop {
    public static void main(String[] args) {
        //verilen stringi asagıdakı gibi yazdıran bir program yazdırın.

        // input= Deniz




        String input="Deniz";

        for (int i = 1; i <=input.length(); i++) {
            for (int j = 1; j <i ; j++) {
                input.substring(j-1, j);
                System.out.print( input.substring(j-1, j));//ilk harf için substring (0,1)olmalı,(j-1=0)

            }
            System.out.println("");

        }

    }
}
