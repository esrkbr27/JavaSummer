package day10strıngManıpulatıon;

public class C04_Equalse_Ignorecase {

    public static void main(String[] args) {
        String str1= "Ali Can";
        String str2= "ali can";
        String str3="ALI CAN";
        String str4= "Ali Can_";
        String str5= "AliCan";
        String str6= "Ali Can"+ "";

        System.out.println(str1.equals(str2)); // false
        System.out.println(str1.equalsIgnoreCase(str2)); // true

        System.out.println(str1.equals(str4)); // false
        System.out.println(str1.equalsIgnoreCase(str4)); // false

        //metınlerı buyuk kucuk ozellıgıne bakmadan esıtlık olarak karsılastırır.farklı bır sımge veya bosluk
        // equalsıgnorecase ı de bozar.

        System.out.println(str1.equalsIgnoreCase(str5)); // False
        System.out.println(str1.equalsIgnoreCase(str6)); // True

    }
}
