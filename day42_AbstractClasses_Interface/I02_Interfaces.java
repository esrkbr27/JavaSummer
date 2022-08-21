package day42_AbstractClasses_Interface;

import java.util.ArrayList;
import java.util.List;

public interface I02_Interfaces {

    int SAYİ=30;
    String ISIM="Yildiz Koleji";

    /*
    Interface bir class değildir.

    Abstract classlar Javada abstraction (soyutlaştırma/kural koyma)
    işlevini yapıyordu, ancak abstract bir classta abstract olmayan ,metotlar da
    olabilir.Bu da full abstraction yapmaya izin vermez.

    Eger Javada içinde hiç concrete metot olamsın dediğimiz bir
    class oluşturmak istiyorsanz, bunu class değil,interface yapmalısınız

   1- interfacelerde concrete metot olmaz

    2-interfaceler full abstraction yaptıklarından interfacelerden obje oluşturulamaz.

    3-interface olan Listden direk obje oluşturamıyorduk.Bunun yerine constructurı listin childı
    olan ArrayList den seciyorduk.
     List<String> list = new ArrayList<String>();

    4-Classlarda bir child birden fazla parent edinemez.
    Ancak interfacelerde concrete metot olmadıgından biz her metodu child classta
    override etmek zorundayız.
    Override ederken kimin söylediğini override ettiğimizin önemi yoktur.

    5-İnterfaceler neyin yapılması gerektiğini söyler,
    ama nasıl yapılacagına karısmaz

     */




}
