package day32_StringBuilder;

public class C05_indexOf_lastIndexOf {
    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder("Pay attention, please");

        sb.indexOf("Pay");
        System.out.println(sb.indexOf("Pay"));//0

        System.out.println(sb.indexOf("e"));//7 ilk harfin ındexı kelımenın indexını verir.

        System.out.println(sb.indexOf("e", 10));//10. indexden sonrakı "e" nın indexi

        System.out.println(sb.lastIndexOf("e"));//19 aramayı sondan yapar, ilk buldugunda işaretler,
        // bastan sayıp indexı hesaplar.

        System.out.println(sb.lastIndexOf("e", 10));//bastan 10. indexe kadar gel
        // geriye dogru tara e yı bulunca bastan indexi say
    }
}
