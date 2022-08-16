package practice_day06;

import java.util.Arrays;

public class Q06_Arrays {

    /*  you have a string "HeySiri"
     * with arrays change it to "ByeSiri" and write changing array
     *(String iniz: "HeySiri"  Diziyi "ByeSiri" ye cevirin )
     *
     */

    public static void main(String[] args) {

        String [] arr = {"HeySiri"};
        System.out.println("Ilk hali : " + Arrays.toString(arr));
        arr[0] = "ByeSiri";
        System.out.println("Son hali : " + Arrays.toString(arr));



        String str = "HeySiri";
        str = str.replace("Hey", "Bye");
        String [] arr1 = new String [1];
        arr1[0] = str;
        System.out.println(Arrays.toString(arr1));
    }
}
