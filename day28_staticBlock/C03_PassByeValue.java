package day28_staticBlock;

public class C03_PassByeValue {
    public static void main(String[] args) {

        /*
          %25 indirimli fiyatı hesaplayıp bize döndüren bir metot oluşturun.
         */

        double satisFiyatı=100;
        double indirimOranı=25;

      double indirimlifiyat=indirimlifiyathesapla(satisFiyatı,indirimOranı);
        System.out.println("indirimlifiyat = " + indirimlifiyat);
        System.out.println("indirimlifiyat = " + indirimlifiyat);
        System.out.println("indirimlifiyat = " + indirimlifiyat);
        System.out.println("indirimlifiyat = " + indirimlifiyat);
        System.out.println("indirimlifiyat = " + indirimlifiyat);
    }

    private static double indirimlifiyathesapla(double satisFiyatı,double indirimOranı) {
        double indirimlifiyat =satisFiyatı*(1-indirimOranı/100);

        return indirimlifiyat;
    }
}
