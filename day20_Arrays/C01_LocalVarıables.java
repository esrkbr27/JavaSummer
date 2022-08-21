package day20_Arrays;

public class C01_LocalVarıables {
    public static void main(String[] args) {
      int sayi=10;
       // System.out.println(sayiMetod);// sayiMetod metod1 de oluşturulmuş local bir variabledır.


        for (int i = 0; i < 20; i++) {
            System.out.println(i);

        }
      //  System.out.println(i); // i loopta oluştrulmuş local varıabledır.sadece loop içersinde kullanılabilir.

      /*
      main metodun içinde statıc varıbale oluşturmayız,ama degerini burda cagırabiliriz.
      static int sayiStatic=20;  static keyword sadece class variableda kullanılabilir
      .metodların  içersinde statıc variable TANIMLANAMZ.
       */


    }

    public static void metod1(){

     //   System.out.println(sayi); //sayi main metotta oluşturulmuş local bir variabledır ve sadece main metotta gecerlidir.


        int sayiMetod=20;
    }
}
