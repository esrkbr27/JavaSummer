package day32_StringBuilder;

public class C02_append {
    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder("Java daha ne yapsın");
        //sonuna bir sey eklemek için append kullanılır."index den itibaren ekle" diye birsey yok sadece sonuna ekleme yapar.
        sb.append("?");
        System.out.println(sb);//Java daha ne yapsın?

        sb.append("5");
        //

        sb.append("Javan",2,4);
        System.out.println(sb);

        sb.insert(4,"her seyı dusunmus,");
        System.out.println(sb);
        //araya ekleme yapmak için append degil insert kullanılır

        sb.insert(22,"valla valla",5,11);
        System.out.println(sb);





    }
}
