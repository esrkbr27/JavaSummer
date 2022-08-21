package day40_final;

public class A {

 protected    String isim="Cüneyt";
    final static String  OKUL="Yildiz koleji";
    /*
    Bir varible final olarak tanımlandıysa
    baska classlardan veya içinde olduğumuz classtan
    bu varibla baska deger atanması mümkün değildir.

    Madem ki değeri değiştirilemiyor
    genelde static te yaparak bu variblea erişim kolaylaştırılabilir.
    final static  variblellar genelde  büyük harfle yazılır.
     */

    final void finalMethod(){
        System.out.println("final methodlar override edilemez.");
        /*
        bir metodu final olarak işaretlerseniz
        bu metot değiştirilemez demektir.
        (override edilemez)
         */
    }
}
