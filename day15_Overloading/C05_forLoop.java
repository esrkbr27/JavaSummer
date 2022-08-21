package day15_Overloading;

public class C05_forLoop {
    public static void main(String[] args) {

        //1 den 5 e kadar (5 dahil)olan tamsayıları toplayalım.

        int toplam = 0;


        for (int i = 1; i <= 5; i++) {
            toplam += i; //toplam 1 oldu.i=1 için
            //toplam 3 oldu.i=2 için
            //toplam 6 oldu.i=3 için
            //toplam 10 oldu.i=4 için
            //toplam 15 oldu i=5 için
        }
        System.out.println("toplam " + toplam);

        //10ndan 20 ye kadar olan sayıları topla
        toplam = 0;
        for (int i = 10; i <= 20; i++) {
            toplam += i;

        }
        System.out.println("10 dan 20 ye kadar olan sayıları toplamı: " + toplam);

        //30 dan 50 ye kadar olan cift sayıları topla
        toplam = 0;
        for (int i = 30; i <= 50; i += 2) {
            toplam += i;

        }
        System.out.println("30 dan 50 ye kadar olan cift sayıları toplamı: " + toplam);

        //2. yöntem
        toplam = 0;
        for (int i = 30; i <= 50; i++) {
            if (i % 2 == 0) {
                toplam += i;

            }

        }
        System.out.println("30 dan 50 ye kadar olan cift sayıları toplamı: " + toplam);

        //


    }
}