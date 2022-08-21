package day28_staticBlock;

public class C01_StaticBlok {

    static int sayi;
    static{
        System.out.println("static blok calısıyor..");
        sayi=10;
        /*
        statıc block class uyelerinin tamamından önce calışır(main metottan bile önce)
        statıc block class oluşturuldugunda calışır

        genellikle de classla ilgili ön ayarlammalar veya
        statıc varıablellara deger atamak için kullanılır.

        statıc blokların class ıcerisinde nerede oldugu önemli dğildir.
        önce static bloklar calışır.

        birden fazla statıc block varsa yukarıdan asagı doğru calışır


         */
    }
    public static void main(String[] args) {
        System.out.println("main metot calışıyor.");
        System.out.println(sayi);

    }

    static{
        System.out.println("main metot altındakı statıc blok calıştı");
    }
}
