package day30_immutable_date;

public class C02_StringHavuzu {
    public static void main(String[] args) {
        String str1 = "Ali Can";
        String str2 = str1 + "";
        String str3 = new String("Ali Can");
        String hiclik = "";
        String str4 = str1.concat(hiclik);

        System.out.println(str1 == str2); // false
        System.out.println(str1.equals(str2)); // true

        System.out.println(str1.equals(str3)); // true
        System.out.println(str1 == str3); // false

        System.out.println(str2.equals(str4)); // true
        System.out.println(str2 == str4); // false

        /*
         Yeni bir string olustururken :
         1- Esitligin saginda new keyword'u olursa
         Java direk yeni bir obje ve referansini olusturur

         2- Eger esitligin saginda bir method calisiyor ya da + islemi yapiliyorsa
         String immutable oldugundan degisikligi kaydetmek uzere
         hemen bir kopya String ve referansini olusturur, sonra degeri hesaplayip
         bu yeni kopya objenin icine koyar
         */

        String str5 = "Ali Can";
        String str6 = str1;

        System.out.println(str1.equals(str5)); // true
        System.out.println(str1 == str5); // true

        System.out.println(str1.equals(str6)); // true
        System.out.println(str1 == str6); // true

        System.out.println(str5.equals(str6)); // true
        System.out.println(str5 == str6); // true

        /*
         Eger yeni String objesi olusturulurken
         new kelimesi kullanilmaz veya
         esitligin saginda bir + islemi olmazsa Java bakar

         Eger dah once olusturulan String objelerden (String Havuzu)
         bire-bir ayni String varsa
         o objeyi ve referansini kullanir,
         bire-bir aynisi yoksa yeni bir obje ve ref olusturur.

         */




    }
}
