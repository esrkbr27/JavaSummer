package day16_forLoop;

public class C06_nestedForLoop {
    public static void main(String[] args) {
        /*
        bazen tek değişken sorunu cözmeye yetmez.
        *
        **
        ***
        ****
        *****
        *******

         */

        // 3 tane yanyana * yazarım
        for (int i = 1; i <= 3; i++) {
            System.out.print("*");
        }

        //alt alta yıldız yazdırmak istediğimde nested for kullanılır.loopun biri yıldız yazdırırken biri satırları
        //kontrol edecek

        for (int i = 1; i <=5 ; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print("* ");
            }
            System.out.println("");
        }

    }
}
