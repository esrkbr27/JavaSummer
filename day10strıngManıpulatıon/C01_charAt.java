package day10strıngManıpulatıon;

public class C01_charAt {
    public static void main(String[] args) {

        String str ="java ögrenmek ne guzel";

        System.out.println(str.charAt(0)); //ilk harfi verir (j)

        System.out.println(str.toUpperCase().charAt(7));// bastan 7. harf (R)

        System.out.println(str.charAt(21)); //(l)

        System.out.println(str.charAt(22)); // Exceptıon hata verdı.

        //System.out.println(str.charAt(22)); //sınırların dısında ındeks verdin
        //son harfi bulmak için stringin uzunlugunun 1 eksigini gireriz

        //charat metodu kullandıgımızda sonuc char olacagı için artık manıpülasyon yapamayız.
        //string metodlarından kullanmamız gereken metod varsa charat den önce kullanmalıyız.
        //- indeks olmaz
        //indeks 0 dan baslar, space de bir karakterdir.

    }
}
