package day15_Overloading;

public class C08_Faktöriyel {
    public static void main(String[] args) {

        /*input olarak verilen bir tamsayı için faktöriyel hesaplayıp yazdıran bir metod oluşturun.verilen sayı
        negatiif veya 20 den büyük olursa girilen sayının faktöriyeli hesaplanamz.uyarısı yazdır.
    */
        int input = 5;
        faktöriyelHesapla(input);


    }

    public static void faktöriyelHesapla(int input) {

        int faktöriyel = 1;

        if (input < 0 || input > 20) {
            System.out.println("verilen sayı için faktöriyel hesaplanamz.");
        } else if (input == 0) {
            System.out.println("0!=1");

        } else {

            for (int i = 1; i <=input; i++) {
                faktöriyel*=i;

            }
            System.out.println("faktöriyel degeri: " + faktöriyel);
        }
    }
}