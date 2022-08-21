package day11strıngManıpulatıon;

public class C05_endsWıth {
    public static void main(String[] args) {
        //sonu ne ile bitiyorsa onu döndürür.

        String str ="Ah be Java";
        System.out.println(str.endsWith("ava")); // true

        System.out.println(str.endsWith("bejava")); //true

        System.out.println(str.endsWith("Ah be Java")); // true

        System.out.println(str.endsWith(""));// true
    }
}
