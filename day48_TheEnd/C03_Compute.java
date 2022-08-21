package day48_TheEnd;

import java.util.HashMap;
import java.util.Map;

public class C03_Compute {
    public static void main(String[] args) {
        Map<String,Integer> harfmap = new HashMap<String,Integer>();
        harfmap.put("a",3);
        harfmap.put("b",4);
        harfmap.put("c",5);
        harfmap.put("d",6);
        harfmap.put("e",7);

        System.out.println(harfmap);

        harfmap.compute("a", (k,v) -> v*2);
        harfmap.compute("b", (a,b)  -> b*b);
        harfmap.computeIfAbsent("c", (v)->30);
        harfmap.computeIfAbsent("f", (v)->30);
        harfmap.computeIfPresent("e", (k,v)->v+30);//varsa değiştir
        harfmap.computeIfPresent("g", (k,v)->v+30);


        System.out.println(harfmap);
    }
}
