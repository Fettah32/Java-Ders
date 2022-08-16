package day43_interfaces_iterators;

public class C02_Child implements I01_InterfaceBodyOlanMethod{
    @Override
    public void motor() {

    }

    @Override
    public void yakit() {

    }

    @Override
    public String aku() {
        return null;
    }
    /*
    Parent interface'de abstract olan 3 method'u implement ettigimizde Java itirazi durdurur
    sonradan ekledigimiz default ya da static keyword ile tanimladigimiz
    method'lari implement etmemiz sorun olusturmadi

    O zaman nicin 2 keyword (static ve default) tanimlanmistir ?
    Bu iki farkli kelimenin amaci
    child class'lardan bu method'a nasil erisilebilecegini belirlemek icindir
    static keyword kullanilirsa, child class'dan bu method'a erismek icin
    InterfaceAdi.methodAdi yeterli olur

    default keyword kullanilirsa, method'a erismek icin obje olusturulmalidir.
     */
    public static void main(String[] args) {
        I01_InterfaceBodyOlanMethod.direksiyon();

        C02_Child obj = new C02_Child();
        obj.teker();
    }

}
