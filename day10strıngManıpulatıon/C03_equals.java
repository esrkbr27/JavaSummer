package day10strıngManıpulatıon;

public class C03_equals {
    public static void main(String[] args) {
        String str1="Ali Can";
        String str2="Ali CAN";
        String str3="Ali Can"+ "";
        String str4="Ali Can";
        String str5=new String("Ali Can");
        String str6="AliCAN";

        //equals metodunda iki metın aynı ıse (bosluklarda aynı olmalı) true degılse false dondurur.
        //Stringlerde esıtlık == ile aranmaz, aranırsa bazen true bazen false dondurebılır.(saglıklı sonuc vermeyebılır)
        // String metınlerın yanındakı "" ıclık esıtlıgı bozmaz.

        System.out.println(str1.equals(str2)); // false
        System.out.println(str1.equals(str4));   // true
        System.out.println(str1.equals(str3)); // true
        System.out.println(str1.equals(str5)); // true
        System.out.println(str2.equals(str6)); // false




    }
}
