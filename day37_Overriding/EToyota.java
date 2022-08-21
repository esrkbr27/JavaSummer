package day37_Overriding;

public class EToyota extends DAraba{

    @Override
  void marka(){
      //  super.marka();
    System.out.println("Markamız Toyota");
    /*
    Eger hem overriden hem de overriding metodun calısmasını
    istersek ilk satırına super.() marka() yazabiliriz.
     */
}

    void motor(){
      System.out.println("toyota araclar toyota marka motor kullanır.");
    }
}
