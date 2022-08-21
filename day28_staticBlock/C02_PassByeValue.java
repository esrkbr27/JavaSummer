package day28_staticBlock;

public class C02_PassByeValue {
    public static void main(String[] args) {
      double satısfiyatı=100;
        System.out.println(indirimliFiyat(satısfiyatı));
        System.out.println(satısfiyatı);
        System.out.println(indirimliFiyat(satısfiyatı));

        //iki farklı metotta satıs fiyatı isminde varıable olabilir,
       // java buna ıtıraz etmez cunku scopeları farklıdır.
    }

    public static double indirimliFiyat (double orjinalFiyat) {
        //method %10 indirim yapıp yenı fiaytı main metoda döndürsün
        //

        double satısfiyatı=orjinalFiyat*0.9;



        return satısfiyatı;
    }
}
