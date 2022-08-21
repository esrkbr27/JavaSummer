package day42_AbstractClasses_Interface;

public class K_ChildClassofInterfaces implements I02_Interfaces,I03_Interfaces{

    public static void main(String[] args) {
/*
Bir classı bir interface child yapmak için implemets keywordu kullanılır,
implemets dedikten sonra , yazarak istediğimiz kadar interface ekleyebiliriz.
 */

        System.out.println(I03_Interfaces.SAYİ);
        System.out.println(I02_Interfaces.SAYİ);
        System.out.println(ISIM);

    }

    @Override
    public void yakit() {

    }

    @Override
    public void motor() {

    }

    @Override
    public void teker() {

    }
}
