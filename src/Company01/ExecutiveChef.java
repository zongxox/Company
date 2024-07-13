package Company01;

import java.io.FileNotFoundException;
import java.io.PrintStream;

//子類 管理人員 廚師
//早1班表  上班08 中午12~14 下班18:00
//早2班表 上班08 中午12~13 下班17:00
public class ExecutiveChef extends Person {
    public static void main(String[] args) throws FileNotFoundException {
        PrintStream ps = new PrintStream("D:\\廚工,行政時間.txt");
        System.setOut(ps);
        System.out.println("早1班表  上班08 中午12~14 下班18:00");
        System.out.println();
        System.out.println(1);
        aa();
        System.out.println();
        System.out.println(2);
        System.out.println();
        aa();
        System.out.println();

        System.out.println("早1班表  上班08 中午12~13 下班17:00");
        System.out.println(1);
        System.out.println();
        bb();
        System.out.println();
        System.out.println(2);
        bb();
        System.out.println();
        System.out.println(3);
        bb();
        ps.close();
    }static void aa(){
        Person aa = new Person();
        for (int i = 0; i < 16; i++) {
            aa.chef();
        }
        System.out.println();
        for (int i = 0; i < 15; i++) {
            aa.chef();

        }
    }

    static void bb(){
        Person bb = new Person();
        for (int i = 0; i < 16; i++) {
            bb.executive();
        }
        System.out.println();
        for (int i = 0; i < 15; i++) {
            bb.executive();
        }
    }

}

