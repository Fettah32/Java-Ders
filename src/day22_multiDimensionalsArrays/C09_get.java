package day22_multiDimensionalsArrays;

import java.util.ArrayList;
import java.util.List;

public class C09_get {
    public static void main(String[] args) {

        List<Integer> sayilar1 = new ArrayList<>();
        sayilar1.add(5);
        sayilar1.add(3);
        sayilar1.add(2);

        List<String> isimler = new ArrayList<>();
        isimler.add("Erdal");
        isimler.add("Hakan");
        isimler.add("Enes");

        System.out.println(isimler.get(2)); //Enes
        System.out.println(sayilar1.get(1)); //3
        /*
        isimler.get(2);
        System.out.println(isimler.get(2));//get index i secersek o bize Enes i getirir cunku ikinci index e denk gelen sırada enes var
        sayilar1.get(1);//sen bana indexi ver ben sana integer dondureyim diyor
        System.out.println(sayilar1.get(1));//3 dondurur
        //bunlara generic methodlar denir, yani ben string bir liste icin calıstırdığımda stringe göre kendisini adapte ediyor ve calisiyor
        //integer bir liste yaptığımda oraya göre kendini düzenliyor ve bana integer donuyor.
         */
    }
}
