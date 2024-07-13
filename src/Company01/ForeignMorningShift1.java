package Company01;

import java.io.FileNotFoundException;
import java.io.PrintStream;

//外籍早班1 上班0800 中午1200~1300 1700~1800 下班2000
public class ForeignMorningShift1 extends Person {
    public static void main(String[] args) throws FileNotFoundException {
        PrintStream ps = new PrintStream("D:\\外籍早班.txt");
        System.setOut(ps);
        System.out.println("外籍早班1 上班0800 中午1200~1300 1700~1800 下班2000");
        System.out.println(1);
        cc();
        System.out.println();
        System.out.println(2);
        cc();
        System.out.println();
        System.out.println(3);
        cc();
        System.out.println();
        System.out.println(4);
        cc();
        System.out.println();

        System.out.println("外籍早班2 上班0800  休息1000~1100  1500~1600  下班2000");
        System.out.println(1);
        dd();
        System.out.println();
        System.out.println(2);
        dd();
        System.out.println();
        System.out.println(3);
        dd();
        System.out.println();
        System.out.println(4);
        dd();

        ps.close();
    }
    static void cc(){
        Person cc = new Person();
        for (int i = 0; i < 16; i++){
            cc.foreigners();
        }
        System.out.println();
        for (int i = 0; i < 15; i++) {
            cc.foreigners();

        }
    }
    static void dd(){
        Person dd = new Person();
        for (int i = 0; i < 16; i++){
            dd.foreigners1();
        }
        System.out.println();
        for (int i = 0; i < 15; i++) {
            dd.foreigners1();

        }
    }


}
