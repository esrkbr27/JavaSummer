package day18_whileDoWhile;

public class C03_doWhileLoop {
    public static void main(String[] args) {
   /*
   WhileLoop da önce kontrol edipsonra işlem yaptıgımız için işlem bittikten sonra loopun kırılması için
   bir kez daha başa dönmek gerekir.bu durumda fazladan bir işlem yapılıyor.
    */
        int sayi=7;

        while(sayi<10) {
            System.out.println(sayi);

            sayi++;
        }


        /*
        do while loop ile calıştıgımızda bu dezavantaj ortadan kalkar.

         */
             sayi=7;
        do{

            System.out.println(sayi);

            sayi++;

        }while(sayi <10);
    }
}
