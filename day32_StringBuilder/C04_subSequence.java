package day32_StringBuilder;

public class C04_subSequence {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Kayra");

        sb.substring(0,3);//bu metot String döndürdugu için StringBuilderın eskı halını degiştiremez.

        System.out.println(sb);//Kayra


        sb.subSequence(0,3);//bu metotta charsequence döndürdüğü için StringBuilderın eskı halını degiştiremez
        System.out.println(sb);
        System.out.println(sb.subSequence(0,1));//K
        /*
          String immutable oldugu için metort String döndürüyorsa StringBuilderı da kendıne benzetir
          değişikliten etkilenmez.

          SubSequence de charsequence döndürdüğü için Stringbuilderı değişmez ancak soutun içinde
          veya atama yapılırsa o zaman değişiklik kalıcı olur.
         */


    }
}
