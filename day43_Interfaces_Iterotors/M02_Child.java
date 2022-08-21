package day43_Interfaces_Iterotors;

public class M02_Child implements I01_InterfeceBodyOlanMetod{
    @Override
    public void motor() {

    }

    @Override
    public void yakit() {

    }

    @Override
    public String akü() {
        return null;
    }

    /*
    Parent interfacede abstract olan 3 metodu implement
    ettiğimizde java itirazını durudrur.
    sonradan eklediğimiz default veya static keyword ile
    tanımladığımız metotları
    implement etmememiz sorun oluşturmadı.
     */
    public static void main(String[] args) {
        I01_InterfeceBodyOlanMetod.direksiyon();//static methoda o classın ismiyle ulastım.


        M02_Child obj=new M02_Child();
        obj.teker();
        /*
        teker metodu default oldugu için obje olşuturarak cagırabiliriz,
        objeyi bu classtan da metodun oldugu classtan da oluşturabilirim.
         */

    }

}
