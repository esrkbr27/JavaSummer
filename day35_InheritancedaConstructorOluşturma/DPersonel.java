package day35_InheritancedaConstructorOluşturma;

public class DPersonel {

    DPersonel() {
        //bu classta extends keywordu yok
        //super(); burda yok. parametresiz constructor calışır.
        System.out.println("Personel parametresiz constructor");
    }

    DPersonel(String isim) {

        System.out.println("Personel parametreli constructor");
    }
}
