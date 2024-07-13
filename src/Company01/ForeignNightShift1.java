package Company01;

import java.io.FileNotFoundException;
import java.io.PrintStream;

//外籍夜班1 上班2000 休息0000~0100 0500~0600  下班0800
public class ForeignNightShift1 extends Person {
    public static void main(String[] args) throws FileNotFoundException {
        PrintStream ps = new PrintStream("D:\\外籍夜班.txt");
        System.setOut(ps);
        System.out.println("外籍夜班1 上班2000 休息0000~0100 0500~0600  下班0800");
        System.out.println(1);
        ee();
        System.out.println();
        System.out.println(2);
        ee();
        System.out.println();
        System.out.println(3);
        ee();
        System.out.println();
        System.out.println(4);
        ee();
        System.out.println();

        System.out.println("外籍晚班2 上班2000 休息2200~2300 下0300~0400  班0800");

        System.out.println(1);
        ff();
        System.out.println();
        System.out.println(2);
        ff();
        System.out.println();
        System.out.println(3);
        ff();
        System.out.println();
        System.out.println(4);
        ff();


        ps.close();
    }
    static void ee(){
        Person ee = new Person();
        for (int i = 0; i < 16; i++) {
            ee.foreignnightshift();
        }
        System.out.println();
        for (int i = 0; i < 15; i++) {
            ee.foreignnightshift();

        }
    }
    static void ff(){
        Person ff = new Person();
        for (int i = 0; i < 16; i++) {
            ff.foreignnightshift1();
        }
        System.out.println();
        for (int i = 0; i < 15; i++) {
            ff.foreignnightshift1();

        }
    }

}
