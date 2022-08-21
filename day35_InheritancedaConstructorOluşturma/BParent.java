package day35_InheritancedaConstructorOluşturma;

public class BParent extends AGrandparents{
    //extends keywordu ile BParent Classı AGrandparents classını parent edindi.

    protected String isim="Parent isim belirtilmedi.";
    protected String parentKlupAdı="Parent klübü";

    BParent(){

        System.out.println("Parent constructor calıştı.");
    }
}
