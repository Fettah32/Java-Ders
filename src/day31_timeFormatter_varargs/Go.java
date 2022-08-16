package day31_timeFormatter_varargs;

public class Go {
    public static void main(String[] args) {
        new Go().Go(1,"hello");
        new Go().Go(2,"hello","hi");
    }
    public void Go(int x,String... y){
        System.out.print(y[y.length-x]+"");

    }
}
