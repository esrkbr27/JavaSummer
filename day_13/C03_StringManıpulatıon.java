package day_13;

public class C03_StringManıpulatıon {
    public static void main(String[] args) {
        String str= " Java ogrenmek123 Cok guzel@ ";

        str=str.trim(); // boşlukları kaldırdık
        str=str.replaceAll("\\d","");//rakamları hiçlik yaptık
        str=str.replaceAll("@","");// @ sildik
        str=str.replace("C","c"); //C yi c yaptık.

        str=str+".";

        System.out.println(str);
    }
}
