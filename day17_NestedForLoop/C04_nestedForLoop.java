package day17_NestedForLoop;

public class C04_nestedForLoop {
    public static void main(String[] args) {
        /*
        verilen inputa göre * lardan oluşan bir üçgen oluşturun
        örnek input=4 ise

        *
        * *
        * * *
        * * * *

         */

        int input=4; // 4 satır var
        for (int i = 1; i <=input ; i++) {
            for (int j = 1; j <i; j++) {
                System.out.println("* ");

            }
            System.out.println("");

        }
    }
}
