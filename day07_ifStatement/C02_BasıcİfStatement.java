package day07_ifStatement;

public class C02_BasıcİfStatement {
    public static void main(String[] args) {

        int sayi=-23;
        if(sayi>0){
            System.out.println("sayi pozitif");
            System.out.println("pozitif kalacaktır");
            System.out.println("ucuncu satır");
        }
        if (sayi%2==0){
            System.out.println("sayi cift");
        }
        if (sayi%5==0){
            System.out.println("Sayi 5'in tam kati");
        }
        /*
        basit if cumleleri kodun diger parcalarindan bagimsizdir
        sadece bir sart kontrol eder, sart saglaniyorsa, if body calisir, yoksa calismaz
        birden fazla basit if cumlesi varsa girilen sarta bagli olarak,
        tumunde if body'si calisabilir, kismen if body'leri calisabilir
        veya hicbir if body'si calismayabilir
         */

        int sayi1=40;

        if (sayi1>0) {
            System.out.println("sayı pozitif");
        }

        if (sayi1%2==0) {
            System.out.println("sayi cift");
        }

        if (sayi1%5==0) {
            System.out.println("sayı 5'in katı");
        }

        if(sayi1%10==0) {
            System.out.println("sayı 10'un katı");
        }


    }

}
