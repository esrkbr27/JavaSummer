package day31_TimeFormater_varags;

public class C02_Varargs {
    public static void main(String[] args) {
        //verilen 2 ınt toplayıp yazdıran bir metot oluşturun,

        int sayi1=10;
        int sayi2=20;
        int sayi3=30;
        int sayi4=40;

        ToplaYazdır(sayi1, sayi2,sayi3,sayi4);

    }

    public static void ToplaYazdır(int sayi1, int sayi2, int sayi3, int sayi4) {
        System.out.println("verilen 4 sayının toplamı:"+(sayi1+sayi2+sayi3+sayi4));
    }

    public static void ToplaYazdır(int sayi1, int sayi2, int sayi3) {
        System.out.println("verilen 3 sayının toplamı: "+(sayi1+sayi2+sayi3));
    }

    public static void ToplaYazdır(int sayi1, int sayi2) {
        System.out.println("verilen iki sayının toplamı: "+(sayi1+sayi2));
    }
}
