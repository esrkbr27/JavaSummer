package day35_InheritancedaConstructorOluşturma;

public class AGrandparents {

    protected String isim="Grandpa ismi belirtilmedi";
    /*
    Her classta görünmese bile bir constructor vardır
    Bu classtan obje oluşturmak istediğimizde default constructor
    devreye girecektir.

    Default constructorı gözlemleyecemeyecegimiz için
    onun yerine kullanılabilecek parameteresiz constructor
    oluşturalım.
     */
       protected String grandpaKlupAdı="Grandpa Klubü";
         AGrandparents() {

        System.out.println("Grandpa Constructor calıştı.");
    }


}
