package day04_DataCasting;

public class C01_DataCasting {
    public static void main(String[] args) {

        char harf='a';
        char yeniharf=(char)(harf+1); // char yeniharf= harf +1;kod bu durumda önce sağdaki işlemi yapar.

                               // char yeniharf= 97+1=98 yapar
                               // char bir variable 98 olamayacagı için java hata verir.

        System.out.println(yeniharf); //b yazdı 98 i chara çevirdi
        // bazen bir varibala oluşturulduğu data türünden başka bir şey atanabilir, bunlardan bazısını java kabul eder.

        int sayi1=(int)7.3; // (cast yaptık) burda parantez koymazsan hata veriyor

        System.out.println("sayi1 :"+ sayi1);// 7 yazdı, virgülden sonrasını atar.veri kaybı oldu.

        double sayi2=10;
        System.out.println("sayi2 :" + sayi2);// 10.0

        int sayi3='c';
        System.out.println("sayi3:"+ sayi3); //99

        char harf2= 98;
        System.out.println("harf2 :"+ harf2); // b

        //java eğer bu değer atamasında sorun oluşacağını(data kayıplarının olabileceği veya datanın başkalaşabileceği)
        // bu durumda otomatik olarak bu atamayı kabul etmez siz bu atamayı istiyorsanız sorumluluğu almanızı bekler.


    }
}
