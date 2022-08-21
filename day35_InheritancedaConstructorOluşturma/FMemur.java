package day35_InheritancedaConstructorOluşturma;

public class FMemur extends EMuhasebe{

    /*
    extends keyword kullanılan classlarda
    ister default constructor bulunsun istersek de ,
    biz yeni constructorlar oluşturalım java
    constructorın ilk satırına super(); constructor call yazar.

    super() constructor call deafult constructora benzer
    görünmese de orda vardır ve calışır ancak biz ilk satıra
    farklı bir constructor call yazarsak java super(); constructorını
    siler.
     */

    FMemur() {
        /*
        Eger bir classta extends keyword varsa  constructor
        ın altında super() constructor vardır
         */
        System.out.println("MemurParametresiz const");

    }
    FMemur(String isim){
        //parenttakı constructora gider.
        System.out.println("MemurParametreli const");

    }

    public static void main(String[] args) {
        FMemur memur1 = new FMemur("ahmet");//bu obje bizi önce parametreli const götürür.

        /*
        eger biz müdahele edip kendi constructor callumuzu
        oluşturmazsak javanın default olarak oluşturdugu constructor call
        her zaman parametresizdir.
        super(); constructor
         */

    }

}
