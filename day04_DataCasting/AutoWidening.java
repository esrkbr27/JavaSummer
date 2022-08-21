package day04_DataCasting;

public class AutoWidening {

    public static void main(String[] args) {

        // dar veri türündeki bir değeri geniş veri türündeki variable otomatik olarak assıgn eder.

        byte sayi1=23;
        short sayi2= 55;

        int sayi3= sayi1 + sayi2; // 88 byte ve short küçük int den

        double sayi4= sayi1*sayi2; // 1265.0

        //sayi2/ sayi1 sonucu virgüllü yani ondalıklı bir sayı olduğu için java hata veriyor (double) yazmazsak.
        sayi4= (double) sayi2/ sayi1;
        System.out.println(sayi4);




    }
}
