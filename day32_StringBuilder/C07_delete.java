package day32_StringBuilder;

public class C07_delete {
    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder("Java her zaman guzel");
        sb.delete(8,9);
        System.out.println(sb);//Java herzaman guzel,8.indexi alır 9. indexi almaz.

        sb.deleteCharAt(7);
        System.out.println(sb);//

        //bastan baslayark her loopta son harfi silip kalanı yazdıralım
        int son=sb.length();//length yazarsak döngünün her seferinde sb nın lengthı değişecegi için istediğimiz souncu alamayız
        for (int i = 0; i < son; i++) {
            sb.deleteCharAt(0);
            System.out.println(sb);

            //bu metotta StringBuilder döndürür.
        }
    }
}
