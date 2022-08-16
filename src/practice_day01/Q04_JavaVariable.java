package practice_day01;

public class Q04_JavaVariable {
    public static void main(String[] args) {
        // Initializing Variable  //variable baslangic degeri verme
        int yas = 27;
        double boy = 1.78;
        System.out.println("yas = " + yas);
        System.out.println("boy = " + boy);

        // To copy the variable's value
        int yasim = 27;
        int enesYas = yasim;
        System.out.println("yasim = " + yasim);
        System.out.println("enesYas = " + enesYas);

        // you can declare multiple variables in the same line
        int yil = 2022, ay = 06, gun = 20;
        System.out.println("yil = " + yil);
        System.out.println("ay = " + ay);
        System.out.println("gun = " + gun);

        // updating a variable
        yil = 2032;
        System.out.println("update yil : " + yil);

        //Bir degisken tanimlayin : x
        //Baska bir degiskeni initialize edin : y
        //x degiskenini initialize edin
        //y degiskenini yeni bir degerle guncelleyin

        int x; //deklarasyon
        int y =2000; //initialize -asingnment
        x=30;//x in initialize
        y=1;  //guncelleme

        System.out.println("x = " + x);
        System.out.println("y = " + y);



    }
}
