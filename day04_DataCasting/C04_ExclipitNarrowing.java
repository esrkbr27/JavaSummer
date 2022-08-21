package day04_DataCasting;

public class C04_ExclipitNarrowing {
    public static void main(String[] args) {

        int sayi1= 50;
        byte sayi2 = (byte) sayi1;

        System.out.println(sayi2);// 50 oldu



        /* geniş data türündeki değeri dar data türündeki variabla atamak isterseniz java sizin geniş data türündeki de
        değerin dar data türünün sınırlarına uyup uymayacağını çalıştırana kadar bilmez.ama java risk almaz,
        riski sıfıra
        indirmek için burda bir sorun olursa sorumluluğu kabul etmenizi bekler. bunun içi değerin önüne () içerisine
        istediğimiz
        data türünü yazmamız yeterlidir.

        bu riski üstlendiğimizde 3 durum oluşabilir.,

        1. bizim değerimiz dar kalıp değerlerine uygun olursa bir problem olmadan cast olur.
        2. double bir sayıyı int cast etmek gibi durumlarda data kaybı yaşanabilir.
        3. geniş kalıptan değeri dar kalıba koyduğunuzda sınırları aşan durumda veri başkalaşabilir.
         */
    }
}
