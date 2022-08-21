package day40_final;

final public class B extends A{

    public static void main(String[] args) {
        B obj=new B();
        obj.isim="Alp";
     //   obj.okul="Java Koleji"; //final bir variable atama yapamazsın.

        System.out.println(A.OKUL);

        System.out.println(Integer.MAX_VALUE); //bu metotlar final static tir.değişmez
        System.out.println(Integer.MIN_VALUE);

        /*
        Bir class final olarak belirlenirse
        o class inherit edilemez.Kimse bu classtan istifade edemez.
        B classı hiç bir classın parentı olamaz.
         */
    }
}
