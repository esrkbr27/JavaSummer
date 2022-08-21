package LambdaFunctionalProgramming;

import java.util.stream.IntStream;

public class F04 {
    public static void main(String[] args) {
        System.out.println("get7den100etoplam() = " + get7den100etoplam());
        System.out.println(get7den100etoplam());
        System.out.println("get2den11ecarpim() = " + get2den11ecarpim());
        System.out.println("faktöriyelHesapla(x) = " + faktöriyelHesapla(6));
        aradakiCiftSayilariTopla(11,5);
    }

    //1) 7'den 100'e kadar integer değerlerinin toplamını bulan bir method oluşturun.
    public static int get7den100etoplam() {

        return IntStream.range(7, 101).reduce(Math::addExact).getAsInt();
        //IntStream bir interfacedir, aralıktakı degerleri collectin gibi kullandırır.
        //belirli bir aralıltakı degerleri kullanmak için range metodu kullanılır.
        //ilkini alıp ikincisini almaz
    }

    //2. yol
    public static int get7den100etoplam2() {

        return IntStream.rangeClosed(7, 100).reduce(Math::addExact).getAsInt();

        //belirli bir aralıltakı degerleri kullanmak için range metodu kullanılır.
        //ilkini ve sonuncusunu alır.
    }

    //2) 2'den 11'e kadar integer değerlerinin çarpımını bulan bir method oluşturun.

    public static int get2den11ecarpim() {

        return IntStream.rangeClosed(2, 11).reduce(Math::multiplyExact).getAsInt();
    }

    //3) Verilen bir sayının faktoriyelini hesaplayan bir method oluşturun. (5 factorial = 1*2*3*4*5  ==> 5! = 1*2*3*4*5)

    public static int faktöriyelHesapla(int x) {
        if (x > 0 && x < 15) {
            return IntStream.rangeClosed(1, x).reduce(Math::multiplyExact).getAsInt();
        }
        System.out.println("0 dan büyük deger giriniz");
        return 0;
    }

    //4) Verilen iki sayı arasındaki çift sayıların toplamını bulan bir method oluşturun.

    public static int aradakiCiftSayilariTopla(int x, int y) {
        int z=0;
        if(x>y){
           z=x;
           x=y;
           y=z;
        }
        return IntStream.rangeClosed(x, y).filter(utils::ciftelemanlarisec).sum();
        //x>y den büyük olunca range metodu geirye dogru sayıları alamayacagı için SWAP ile yer değiştirdim.
    }

    //5) Verilen iki sayı arasındaki tüm sayıların rakamlarının toplamını hesaplayan bir method oluşturun.
    //  23 and 32 ==> 2+3  +  2+4  +  2+5  +  2+6  +  2+7  +   2+8  +   2+9  +   3+0  +   3+1  +   3+2 ==> 68

    public static int ikisayiarasındakisayilarinrakamlarinitopla(int x,int y){
        int z=0;
        if(x>y){
            z=x;
            x=y;
            y=z;
        }

        return IntStream.rangeClosed(x,y).map(utils::rakamlarToplami).sum();

        //toplamları alınca stream formatında oldugu için sum() diyerek rakamlarToplaminın toplsmını aldım.
    }
}