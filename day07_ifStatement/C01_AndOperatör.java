package day07_ifStatement;

public class C01_AndOperatör {
    public static void main(String[] args) {

        int a = 10;
        int b = 15;
        int c = 20;

        System.out.println(a > 0 && b < 20 && c >= b); // true ( a doğru,b doğru, c doğru)

        System.out.println(a < 0 && b < 20 && c >= b);// false (a false, b doğru, c doğru)// başta false  olunca diğerlerine bakmaz.

        // java & operatörü konusunda iki seçenek sunar. eğer && kullanırsak ilk false bulduğunda artık sonucun false
        // olduğunu bilir ve diğer şartları incelemez ama tek & olursa tüm şartları kontrol eder sonra sonucu belli eder.
        // bu usulden dolayı & oprt && e göre daha yavaş olabilir


        System.out.println(a < 0 & b < 20 & c >= b);// false (a false  olsa da diğerlerine de bakar)
    }



}
