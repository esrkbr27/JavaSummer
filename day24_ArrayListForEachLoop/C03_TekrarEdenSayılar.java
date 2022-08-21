package day24_ArrayListForEachLoop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C03_TekrarEdenSayılar {
    public static void main(String[] args) {



        int[] arr={2,3,5,6,3,5,4,1,9,6,3,5,5};

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));//[1, 2, 3, 3, 3, 4, 5, 5, 6, 6, 9]
        List<Integer> tekraredenler = new ArrayList<Integer>();

        //ılkıne bakarın yanındakı ıle aynı ıse yazdırırım
        for (int i = 0; i < arr.length-1; i++) {
            if(arr[i] == arr[i + 1] && !tekraredenler.contains(arr[i])) {
                System.out.print(arr[i]+ " ");
                tekraredenler.add(arr[i]);

            }

        }

    }
}
