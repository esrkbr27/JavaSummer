package day03_scanner;

public class C02_SWAP {

    public static void main(String[] args) {

         /*
        1- Verilen sayi1 ve sayi2 variable’larinin degerlerini degistiren (SWAP)
        bir program yaziniz
         Orn    : sayi1=10 ve
                  sayi2=20;
          kod calistiktan sonra
                  sayi1=20 ve
                  sayi2=10


         */
        // önce boş bir variable tanımlıyoruz. sayi3=0, sonra sayi3 ü sayi2 değerine atıyoruz.

        int sayi1=10;
        int sayi2=20;
        int sayi3=0;

        sayi3= sayi2; //bu durumda sayi3= 20 oldu // 10    20   20


        //sonra sayi1 i sayi2 ye eşitliyoruz.

        // sonra sayi2= sayi1 e eşitliyoruz
        sayi2= sayi1;

        //sayi1 i sayi3 e eşitliyoruz.//  10    10   20

        sayi1=sayi3;

        System.out.println("swaptan sonra sayi1 : "+ sayi1);
        System.out.println("swaptan sonra sayi2 : "+ sayi2);





    }

}
