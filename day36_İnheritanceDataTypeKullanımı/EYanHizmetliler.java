package day36_İnheritanceDataTypeKullanımı;

public class EYanHizmetliler extends BMuhasebe {

  protected   int saatUcreti=9;
   protected int gunlukMesai=8;

    protected void maas(){
        System.out.println("YanHizmetliler : "+(30*saatUcreti*gunlukMesai)+ "maas alır.");
    }

    protected void issizlikSigorta(){
        System.out.println("YanHizmetliler %30 indirimli issizlik sigortası yaptırabilir");
    }

    public static void main(String[] args) {


    /*
    Overriding child classtaki bir metodun,
    parent classtaki aynı isimdeki metodu etkisiz hale getirerek
    kendisinin spesifik özelliğini ortaya cıkarmasıdır.

    Overriding i nerede dikkate alıyoruz?
    bir obje oluşturulurken data türü ve constructor farklı ise

    eger bir obje oluşturulurken data türü ve constructor farklı ise
    objenın özelliklerini belirlerken 3 konuya dikkat cekmeliyiz.
    1-->Obje constructorın oldugu classta oluşur.
    2-->Objenın özelliklerini aramaya data türünün oldugu classtan aramaya baslarız
    bu classta aranan özellik bulunamazsa parent classa bakılır,ordada bulamazsak CTE verir.

    Eger aranan özellik varıable ise buldugumuz ilk degeri yazdırırız.

    3-->Aranan özellik metot ise degeri yazdırmadan önce override edilmiş mi diye
    kontrol etmemeiz gerekir.
    eger override edildiyse en güncel degeri yazdırırız.(metotun en sondakı halı nedir)
     */

        BMuhasebe yh1 = new EYanHizmetliler();
        //constructor burda data

        System.out.println(yh1.gunlukMesai);// muhasebeden aldı 8
        System.out.println(yh1.saatUcreti);//  Muhasebeden aldı 10

        yh1.maas();//EYanHizmetlilerden aldı override edilmiş
        yh1.ozelSigorta();// muhasebeden aldı override edilmemiş
        yh1.sigorta();// APersonelden aldı override edilmemiş

        System.out.println(yh1.isim);//personelden
        System.out.println(yh1.soyisim);//personelden
        System.out.println(yh1.departman);//personelden
      //  System.out.println(yh1.issizlikSigorta);
        /*
        *** issizlikSigorta yı aramaya muhasebeden aramaya basladım,yok
            parenta gittim orda da YOK!!! olmadıgı için override var mı diye bakamam
            CTE VERİR.
         */


    }
}
