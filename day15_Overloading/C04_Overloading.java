package day15_Overloading;

public class C04_Overloading {
    public static void main(String[] args) {

        topla(5, 7); // 12 yazdırır.
        topla (5.2,3);
        topla(3.4,6.1);
        topla(5,6.2);
    }
/* java hangi metodun calışacagına karar verirken optimizasyon yapar.Hiç casting yapmadan kullanacagı varsa onu kullanır.
   cast yapmadan kullanacagı metod yoksa en az cast yaparak kullanabilecegi metodu tercih eder.
 */
    public static void topla(int sayi1, int sayi2) {
        System.out.println("iki intın toplamı: " + (sayi1 + sayi2));
    }

    public static void topla(double sayi1, double sayi2) {
        System.out.println("iki doubleın toplamı: " + (sayi1 + sayi2));
    }

    public static void topla(double sayi1, int sayi2) {
        System.out.println("bir double,bir intın toplamı: " + (sayi1 + sayi2));
    }

}

