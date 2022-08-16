package day41_abstractClass_Interface;

public class FMercedes extends DAraba{
    @Override
    protected void yakit() {
        /*
        Abstract bir parent'in concrete child class inherit ederse
        partent abstract class'daki tum abstract method'lari override etmek ZORUNDADIR

        abstract bir class, abstract baska bir class'i parent edinirse
        parent class'daki tum abstract method'lari override etmek
        ZORUNDA DEGILDIR
         */

    }

    @Override
    protected void kaporta() {

    }

    @Override
    protected void motor() {

    }
}
