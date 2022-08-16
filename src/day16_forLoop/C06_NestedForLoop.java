package day16_forLoop;

public class C06_NestedForLoop {
    public static void main(String[] args) {

        /*
        Bazen tek degisken sorunu cozmeye yetmez
        *
        **
        ***
        ****
        *****
         */
        // yan yana 3 tane * yaz
        for (int i = 0; i <= 3; i++) {
            System.out.print("* ");
        }
        // yan yana 4 tane * yaz
        System.out.println("");
        for (int i = 0; i <= 4; i++) {
            System.out.print("* ");
        }
        // bu tur durumlarda ic ice (nested loop) kullanmak gerekir

        for (int i = 1; i <= 5 ; i++) {
            for (int j = 1; j <= i ; j++) {
                System.out.print("* ");

            }
            System.out.println("");

        }
    }
}
