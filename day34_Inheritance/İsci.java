package day34_Inheritance;

public class İsci extends Personel{
    /*
    Normal hayatta parent cocuk sahıbı olmaya kara verir,
    java da ise child classlar özelliklerini inherit etmek
    istedikleri classı kendilerine parent edinirler.

    mesela isci classını oluşturunca nelere ihtiyacları var diye düşünürsek
    personel clasıındakı tum metod ve varıablellara ihtiyacı oldugunu görebiliriz

     bu durumda bunları yeniden oluşturmka yerine personel classını kendimize parent
     ediniriz.

     Bir classı parent edinmek için extends keyword kullanmalıyız.
     */
    int persNo=1001;
    public static void main(String[] args) {
        //içinde bulundugumuz classtan obje ürettik,baska classın özelliğini kullanıyoruz.
        İsci isci1=new İsci();
        System.out.println(isci1.isim);
        //kendi classımda isim variable olmadıgı için parent classtakını yazdırır
        isci1.isim="Selim";
        System.out.println(isci1.isim);

        System.out.println(isci1.persNo);
        //kendi classımızda persNo oldugu için onu yazdırır

        isci1.maas();//yazdırınca "Tum personelin maası vardır." yazar.


    }
    //bu classta maas() metodu oluşturursak parent classtakı metodu değil burdakini yazdırır.
    public  void maas() {
        System.out.println("İsciler minimum 15£ saat ucreti alır.");
    }

    public void özelSigorta() {
        System.out.println("İscilerden isteyene %50 özel Sigorta yaptırılır.");
    }


    /*
    Bir class baska bir classı parent edindiğinde
    1-->parent classtaki tüm özellikleri (variable, metot)
    otomatik olarak sahip olur
    (isim,departman,persno hepsine sahip oldu kullanmasa bile)

    2-->parent classtaki özelliklerden bazılarını kendine uyarlayabilir.
    (isim,persNo variableını burda değiştim,maas() metodunu değiştim)

    3-->Parent classta olmayan bazı yeni özellikler oluşturabilir.
    (özelSigorta metodu ekledim)

    not:Parent classtaki özelliklerden hiçbirini reddedemez ama değiştirebilir.
     */
}
