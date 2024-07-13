package Company01;

import java.io.FileNotFoundException;
import java.io.PrintStream;

//護士早班 上班08 中午12~13下班17:00
public class NurseMorning extends Person {
    public static void main(String[] args) throws FileNotFoundException {
        PrintStream ps = new PrintStream("D:\\護士時間.txt");
        System.setOut(ps);
        System.out.println("護士早班 上班08 中午12~13下班17:00");
        System.out.println(1);
        bb();
        System.out.println();
        System.out.println(2);
        bb();
        System.out.println();
        System.out.println(3);
        bb();
        System.out.println();
        System.out.println(4);
        bb();
        System.out.println();
        System.out.println(5);
        bb();
        System.out.println();

        System.out.println("護士小夜 上班1600 下班2000 上班2100 下班0100");
        System.out.println();
        System.out.println(1);
        gg();
        System.out.println();
        System.out.println(2);
        gg();
        System.out.println();
        System.out.println(3);
        gg();
        System.out.println();
        System.out.println(4);
        gg();
        System.out.println();

        System.out.println("護士大夜班 上班0000 下班0400 上班0500 下班0900");
        System.out.println();
        System.out.println(1);
        hh();
        System.out.println();
        System.out.println(2);
        hh();
        System.out.println();
        System.out.println(3);
        hh();
        System.out.println();
        System.out.println(4);
        hh();


        ps.close();
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
static void gg(){
    Person gg = new Person();
    for (int i = 0; i < 16; i++) {
        gg.nursenightshift();
    }
    System.out.println();
    for (int i = 0; i < 15; i++) {
        gg.nursenightshift();
    }
}
static void hh(){
    Person hh = new Person();
    for (int i = 0; i < 16; i++) {
        hh.Nursesbignightshift();
    }
    System.out.println();
    for (int i = 0; i < 15; i++) {
        hh.Nursesbignightshift();
    }
}

}


