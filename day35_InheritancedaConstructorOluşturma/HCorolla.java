package day35_InheritancedaConstructorOlu┼čturma;

public class HCorolla extends GToyoto {

    HCorolla() {
        System.out.println("HCorlia parametresiz const");
    }

    HCorolla(String isim){
        super(isim);
        System.out.println("HCorlia parametreli const");

    }
}
