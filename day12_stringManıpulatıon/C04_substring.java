package day12_stringManıpulatıon;

public class C04_substring {
    public static void main(String[] args) {

        String str="Java cok yasa";
        System.out.println(str.substring(3,4));// a dan sonra alıcam 3 dahil, 4.indexden sonrasını alma demek

        System.out.println(str.substring(5,7));//co yazdırır.

        System.out.println(str.substring(6,6)); // "" ,

        System.out.println("===");

        // System.out.println(str.substring(6,2)); // exceptıon
        //run tıme error
    }
}
