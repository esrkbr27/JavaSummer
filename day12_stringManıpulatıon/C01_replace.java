package day12_stringManıpulatıon;

public class C01_replace {
    public static void main(String[] args) {

        String str=" Bu gun ha va cok guz el ";
        System.out.println(str.replace(" ",""));

        //hava kelımesını jav ayapalım

        System.out.println(str.replace("h","J").replace(" ",""));

        // guz el yerıne harıka yapalım

        System.out.println(str.replace("guz el","harıka"));

        //cumleyı replace kullanarak Bugun Java cok guzel yapalım
        str=str.replace(" Bugun","bugun")
                .replace("ha va","Java")
                .replace("guz el","guzel");

        System.out.println(str);// atama yapınca kalıcı oldu// Bu gun Java cok guzel


    }
}
