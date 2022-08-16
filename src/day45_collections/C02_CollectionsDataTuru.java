package day45_collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class C02_CollectionsDataTuru {
    public static void main(String[] args) {

        /*
        Collections elmas icerisinde <dataTurunu> object secmeniz durumunda
        collection'a farkli data turlerinden objeler koymaniza izin verir
        Bu depolama acisindan bize esneklik saglar
        Ancak islem yaparken tum objeleri Object olarak tanimladigimizdan
        cok fazla casting yapmamiz gerekir
         */

        List<String> liste = new ArrayList();
        //liste.add(5);
        //liste.add('s");
        //liste.add(true);

        List list = new ArrayList();
        list.add(5);
        list.add('s');
        list.add(true);
        list.add("Ali");

        System.out.println(list); // [5, s, true, Ali]

        list.set(0, (Integer)list.get(0)+5);
        list.set(3, list.get(3)+ " Can");
        list.set(2, !(Boolean)list.get(2));

        Set<Object> set1 = new HashSet<>();
        set1.add(5);
        set1.add(true);
        set1.add('5');
        set1.add("Cennet");

        System.out.println(set1);
    }
}
