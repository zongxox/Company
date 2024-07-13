package Company01;

import java.io.FileNotFoundException;
import java.io.PrintStream;

//台籍早班1 上班0800 休息1200~1400 下班1800
public class TaiwaneseMorningShif1 extends Person {
    public static void main(String[] args) throws FileNotFoundException {
        PrintStream ps = new PrintStream("D:\\台籍早班.txt");
        System.setOut(ps);
        System.out.println("台籍早班1 上班0800 休息1200~1400 下班1800");
        System.out.println(1);
        aa();
        System.out.println();
        System.out.println(2);
        aa();
        System.out.println();
        System.out.println(3);
        aa();
        System.out.println();
        System.out.println(4);
        aa();
        System.out.println();

        System.out.println("台籍早班2 上班0800 休息1000~1100  1500~1600   下班1800");
        System.out.println(1);
        jj();
        System.out.println();
        System.out.println(2);
        jj();
        System.out.println();
        System.out.println(3);
        jj();
        System.out.println();
        System.out.println(4);
        jj();

        ps.close();
    }
    static void aa(){
        Person aa = new Person();
        for (int i = 0; i < 16; i++) {
            aa.chef();
        }
        System.out.println();
        for (int i = 0; i < 15; i++) {
            aa.chef();
        }
    }
    static void jj(){
        Person jj = new Person();
        for (int i = 0; i < 16; i++) {
            jj.taiwanesemorningshift2();
        }
        System.out.println();
        for (int i = 0; i < 15; i++) {
            jj.taiwanesemorningshift2();
        }
    }
}
