package day32_StringBuilder;

public class C06_replace {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Calm down");

        System.out.println(sb.replace(5, 10, "up"));//Calm up

        sb.replace(4,5,"---");
        System.out.println(sb);//Calm---up

        System.out.println(sb.replace(4, 7, " "));//Calm up
        System.out.println(sb.replace(5, 7, "down"));//Calm down

        //replace StringBuilder döndürür.Bu yüzden atama sout yapmadan ilk halidekı değişiklik kalıcı olur.

    }
}
