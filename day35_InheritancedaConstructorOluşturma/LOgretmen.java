package day35_InheritancedaConstructorOlu┼čturma;

public class LOgretmen {
    LOgretmen () {
        //burda super() olmaz.
        System.out.println("LOgretmen parametresiz const.");

    }

    LOgretmen (String isim) {
        this();
        System.out.println("LOgretmen parametreli const");

    }
}
