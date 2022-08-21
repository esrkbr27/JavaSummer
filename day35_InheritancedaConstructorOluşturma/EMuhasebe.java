package day35_InheritancedaConstructorOluşturma;

public class EMuhasebe extends DPersonel {
    EMuhasebe(){
  //super(); const calıştı.
        System.out.println("Muhasebe parametresiz conts");
    }

    EMuhasebe(String isim){
        System.out.println("Muhasebe parametreli const");

    }
}
