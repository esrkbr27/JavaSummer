package day35_InheritancedaConstructorOluşturma;

public class HCorolla extends GToyoto {

    HCorolla() {
        System.out.println("HCorlia parametresiz const");
    }

    HCorolla(String isim){
        super(isim);
        System.out.println("HCorlia parametreli const");

    }
}
