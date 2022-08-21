package day02_variables;

public class C02_Variables {
    public static void main(String[] args) {

        int sayi = 10;
        boolean güzelMi = true;
        char sayim = '3';

        System.out.println(sayi);// 10
        System.out.println("sayi"); // sayi
        System.out.println("sayi : " + sayi); // sayi:10


        //  """""""""""""""""""""""""ÖDEV"""""""""""""""""""""""""""""""""""//

        //ÖDEV1:Farklı 3 data türünde varb oluştur, yazdır

        String okuladı = " Atatürk ilkokulu";

        boolean yoklamadaVarmı = true;

        double bebeğinKilosu = 2.70;

        System.out.println("Okuladı : " + okuladı);
        System.out.println("Yoklamada var mı :" + yoklamadaVarmı);
        System.out.println("bebeğin kilosu : " + bebeğinKilosu);

        //ÖDEV2:isim ve soyisim için varbl oluştur.

        String isim = "Esra";
        String soyisim = "Demirci";

        System.out.println("isminiz : " + isim);
        System.out.println("soyisminiz : " + soyisim);

        //ÖDEV3: iki farklı data türünde 2 varb oluştur, bunların toplm yazdır.

        int x = 25;
        byte y = -55;
        int toplam = x + y;
        System.out.println("x+y=" + toplam);

        //ÖDEV4: Bir tamsayı, bir ondlkl sayı varbl oluştur, toplmını yazdır

        long a = 235004567; // 10. BASAMAKTA HATA VERİYOR!!!
        float b = 10.2f;
        double tplm = a + b;

        System.out.println("a+b = " + tplm); // ***SOR???**** SONUÇTA E YAZDIRDI.

        //ÖDEV5: Char data türünde bir vrbl oluştur ve yazdır.

        char şubeadı = 'A';
        System.out.println("şube adı : " + şubeadı);

        //ÖDEV6: Bir char ve bir tamsayı varbl oluştur ve bunların toplamını yazdır.




    }}
