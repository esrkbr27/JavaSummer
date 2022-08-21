package day35_InheritancedaConstructorOluşturma;

public class GToyoto {

    GToyoto() {
        System.out.println("GToyoto parametresiz constructor");
    }

    GToyoto(String isim){
        // super(isim) EXTENDS OLMADIGI İÇİN super() constructor callu kabul etmez.
        //burda super(isim) olamaz extends yok direk parametreli calıştı
        System.out.println("GToyoto parametreli constructor");
    }


}
