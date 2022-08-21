package day12_stringManıpulatıon;

public class C02_replaceAll {
    public static void main(String[] args) {
        String str="1Bu2gu3n Ja*va- cok g3uz/el";
        // str ı "Bugun hava cok guzel" yap.rakamları hıclık yapmak gerek tek tek.
        //replaceAll ile butun ozel karakterlerı sıl, butun sayıları sılerek yaparız yapabılırız
        //tum ozel karakterlerı sılelım dedıgımızde spacelerde sılınıyor, spacelerı korumak için en basta onların
        //yerıne cumlede bulunmayacak bır String koyalım."qazwsx" koyalım space yerıne

        str=str.replace(" ","qazsx");//1Bu2gu3nqazsxJavaqazsxcokqazsxg3uzel
        str=str.replaceAll("\\W","");
        System.out.println(str); //1Bu2gu3nJavacokg3uzel

        str=str.replaceAll("\\d","");
        System.out.println(str);//ıstenmeyen ozel karakter ve sayılardan kurtulduk,simdi spacelerı getırelım

        str=str.replace("qazsx"," ");
        System.out.println(str);


    }
}
