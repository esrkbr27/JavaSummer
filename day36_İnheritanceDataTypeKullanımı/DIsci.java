package day36_İnheritanceDataTypeKullanımı;

public class DIsci extends BMuhasebe {
    protected int saatUcreti=11;
    protected int gunlukMesai=7;


    protected void maasIsci(){
        System.out.println("Isciler:"+(30*gunlukMesai*saatUcreti)+"maas alır.");
    }

    protected void ozelSigortaIsci(){
        System.out.println("İscilere %70 indirimli özel sigorta yapılır.");
    }

    public static void main(String[] args) {
        BMuhasebe isci1=new DIsci();//data türü ve constructor farklı

        /*
        Bir obje oluşturulurken data türü ve constructor
        aynı classtan ise direk o classa gidiyordk

        eger data türü ve constructor farklı ise öncelikle;
        OBJE constructorın oldugu classın objesidir ancak
        bizden istenen Isci classındaki spesific özellikler değil,
        bir iscinini muhasebe classındakı tüm calışanlarla beraber
        sahip oldugu genel özellikleri istiyoruz.


         */
         //data türü muhasebeden oldugu için istenen seyleri aramayı burdan değil muhasebeden yapıyoruz.
        System.out.println(isci1.gunlukMesai);// muhasebeden aldı 8
        System.out.println(isci1.saatUcreti);//  Muhasebeden aldı 10

        isci1.maas();//muhasebeden aldı
        isci1.ozelSigorta();// muhasebeden aldı
        isci1.sigorta();// APersonelden aldı

        System.out.println(isci1.isim);//personelden
        System.out.println(isci1.soyisim);//personelden
        System.out.println(isci1.departman);//personelden


        APersonel isci2 = new DIsci();

    //    System.out.println(isci2.gunlukMesai);// APersonelde gunlukMesai yok
    //    System.out.println(isci2.saatUcreti);//  APersonelde saatUcreti yok
    //    isci2.ozelSigorta();
        isci2.maas();
        /*
        aramaya APersonelden basladım, var o zaman override var mı diye bakarım
        bir alttaki classa ,var bir altta (child) da var mı yok, o zaman muhasebedekini yazdırır.
        eger child da da olsaydı Child classtaki maas() metodunu yazdırırdım.
         */
        isci2.sigorta();// APersonelden aldı

        System.out.println(isci2.isim);
        System.out.println(isci2.soyisim);
        System.out.println(isci2.departman);

        /*
        Eger data türü olan classta aradıgımız özellik yoksa
       (varsa parenta gider.)
        ama childa dönüş olmaz.
        aradıgı özellik bulamazsa CTE verir.
         */


    }
}
