package Company01;

import java.io.FileNotFoundException;
import java.io.PrintStream;

//台籍夜班1 上班2000 休息0000~0200  下班0600
public class TaiwaneseNightShift1 extends Person {
    public static void main(String[] args) throws FileNotFoundException {
        PrintStream ps = new PrintStream("D:\\台籍夜班.txt");
        System.setOut(ps);
        System.out.println("台籍夜班1 上班2000 休息0000~0200  下班0600");
        System.out.println(1);
        kk();
        System.out.println();
        System.out.println(2);
        kk();
        System.out.println();
        System.out.println(3);
        kk();
        System.out.println();
        System.out.println(4);
        kk();
        System.out.println();

        System.out.println("台籍夜班2 晚班2 上班2000 休息2200~2300 0300~0400 下班0600");
        System.out.println(1);
        ll();
        System.out.println();
        System.out.println(2);
        ll();
        System.out.println();
        System.out.println(3);
        ll();
        System.out.println();
        System.out.println(4);
        ll();


        ps.close();
}
    static void kk(){
        Person kk = new Person();
        for (int i = 0; i < 16; i++) {
            kk.taiwanesenightshift1();
        }
        System.out.println();
        for (int i = 0; i < 15; i++) {
            kk.taiwanesenightshift1();
        }
    }
    static void ll(){
        Person ll = new Person();
        for (int i = 0; i < 16; i++) {
            ll.taiwanesenightshift2();
        }
        System.out.println();
        for (int i = 0; i < 15; i++) {
            ll.taiwanesenightshift2();
        }
    }
}
