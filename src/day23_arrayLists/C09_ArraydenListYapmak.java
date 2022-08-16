package day23_arrayLists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C09_ArraydenListYapmak {
    public static void main(String[] args) {

        /*
        List ile calisirken en kotu ozelligi elemanlari tek tek eklemek

         */

        Integer[] arr = {2, 3, 5, 6, 8, 4, 2, 6, 9, 0, 1, 3, 6, 4, 2, 7, 0};
        /*
         Bu kadar cok elemanli listeyi tek tek eleman olarak girmek yerine
         Array olusturup for loop ile olusturdugumuz list'e tasiyabiliriz
         */

        List<Integer> sayilar = new ArrayList<>();

        for (int i = 0; i < arr.length ; i++) {
            sayilar.add(arr[i]);
        }
        System.out.println(sayilar); // [2, 3, 5, 6, 8, 4, 2, 6, 9, 0, 1, 3, 6, 4, 2, 7, 0]

        /*
         Bu islemi yapmasi icin Java'nin olusturdugu bir method da var
         ancak bu yontemin cok yan etkisi var

         1- Bu sekilde olusturulan listede add, remove gibi size'i degistiren
         method'lar KULLANILAMAZ!!!
         2- asList method'u ile olusturulan liste ve kaynak olan array
         birbiri ile ilisik olarak hayatlarina devam ederler
         birinde yaptigimiz degisiklik, digerini de etkiler
         */

        List<Integer> sayilar2 = Arrays.asList(arr);
        System.out.println(sayilar2); // [2, 3, 5, 6, 8, 4, 2, 6, 9, 0, 1, 3, 6, 4, 2, 7, 0]

        sayilar.add(5);
        System.out.println(sayilar); // [2, 3, 5, 6, 8, 4, 2, 6, 9, 0, 1, 3, 6, 4, 2, 7, 0, 5]

        //sayilar2.add(5);
       // System.out.println(sayilar2); //  cortladi exception verdigi icin yoruma alindi

        arr [0] = 20;
        System.out.println(Arrays.toString(arr)); //[20, 3, 5, 6, 8, 4, 2, 6, 9, 0, 1, 3, 6, 4, 2, 7, 0]

        System.out.println("Array'de degisiklik yapinca bizim sayilar2 : " + sayilar2); // [20, 3, 5, 6, 8, 4, 2, 6, 9, 0, 1, 3, 6, 4, 2, 7, 0]

        /*
        int n [][] = {{1,3},{2,4}};
        for (int i = n.length - 1; i >= 0 ; i--) {
            for (int y : n[i]) {
                System.out.println(y);
            }
        }
        */



    }
}
