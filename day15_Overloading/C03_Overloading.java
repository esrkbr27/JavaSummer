package day15_Overloading;

public class C03_Overloading {
    public static void main(String[] args) {

        topla(5, 7); // 12 yazdırır.
        topla (5.2,3);
        topla(3.4,6.1);
    }

    public static void topla(int sayi1, int sayi2) {
        System.out.println("iki intın toplamı: " + (sayi1 + sayi2));
    }
/*  parametre sayısı ve data türü aynı olan  2 metod oluşturamayız.
    public static void topla(int sayi1, int sayi2){
        System.out.println("iki intın toplamı: "+ (sayi1+sayi2));
    }
}*/

    //iki double ve double ve int ile 3 farklı metod oluşturabiliriz.
public static void topla(double sayi1, double sayi2) {

    System.out.println("iki doubleın toplamı: " + (sayi1 + sayi2));
}
    public static void topla(int sayi1, double sayi2) {
        System.out.println("bir intın bir doubleın toplamı: " + (sayi1 + sayi2));
    }

    public static void topla(double sayi1, int sayi2) {

    System.out.println("bir double bir intın toplamı: " + (sayi1 + sayi2));

    }
    public static void topla(int sayi1, int sayi2,int sayi3) {
        System.out.println("üç intın toplamı: " + (sayi1 + sayi2));

    }

}


