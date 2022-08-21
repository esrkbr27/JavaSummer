package day34_Inheritance;

public class ToyotaCorolla extends Toyota {

    public static void main(String[] args) {

        ToyotaCorolla arb1 = new ToyotaCorolla();

        System.out.println(arb1.marka);
       // System.out.println(arb1.model);//parentta private olursa model yazılamaz.
        /*
        Child classtan parent classa erişimde access modifier
        kurallarını bypass edemeyız
        parent classta olan private class üyelerini kullanamayız

        parent ve child classlar farklı package da olursa
        parent classtakı default access modifieri olan
        class uyelerini child classta kullanamayız.
         */
    }

}
