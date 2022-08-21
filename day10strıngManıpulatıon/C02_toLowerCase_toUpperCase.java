package day10strıngManıpulatıon;

import java.util.Locale;

public class C02_toLowerCase_toUpperCase {
    public static void main(String[] args) {

        String str="Beni psikopata baglamayın";

        System.out.println(str.toUpperCase()); // BENi PSIKOPATA BAGLAMAYIN

        System.out.println(str.toUpperCase(Locale.forLanguageTag("Tr")));

        /*eger büyük küçük harf dönüşümünde local bir dili esas almak isterseniz bu metod kullanılabilir.UpperCase
        parantezın içine "Locale". yazınca LanguageTag yazınca ıstedıgımız dılı buaraya ayzınca o dıldekı yazıma cevırır.
        */
    }
}
