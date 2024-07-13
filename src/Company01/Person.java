package Company01;

//父類
public class Person {

    int a = (int) (Math.random() * 10);
    int b = (int) (Math.random() * 10);
    int c = (int) (Math.random() * 10);
    int d = (int) (Math.random() * 10);
    int e = (int) (Math.random() * 10);
    int f = (int) (Math.random() * 10);


    void chef() {//廚工,台籍早班1
        Person a = new Person();

        System.out.println("07:5" + a.a + "\t" + "12:0" + a.b + "\t" + "13:5" + a.c + "\t" + "18:0" + a.d);
    }
    void executive() {//行政,護士早班
        Person b = new Person();
        System.out.println("07:5" + b.a + "\t" + "12:0" + b.b + "\t" + "12:5" + b.c + "\t" + "17:0" + b.c);
    }
    void foreigners(){//外籍早班1
        Person c = new Person();
        System.out.println("07:5" + c.a + "\t" + "12:0" + c.b + "\t" + "12:5" + c.c + "\t" + "17:0" + c.d + "\t" + "17:5" + c.e + "\t" + "20:0" + c.f);
    }
    void foreigners1(){//外籍早班2
        Person d = new Person();
        System.out.println("07:5" + d.a + "\t" + "10:0" + d.b + "\t" + "10:5" + d.c + "\t" + "15:0" + d.d + "\t" + "15:5" + d.e + "\t" + "20:0" + d.f);
    }
    void foreignnightshift(){//外籍晚班1
        Person e = new Person();
        System.out.println("19:5" + e.a + "\t" + "00:0" + e.b + "\t" + "00:5" + e.c + "\t" + "05:0" + e.d + "\t" + "05:5" + e.e + "\t" + "08:0" + e.f);
    }
    void foreignnightshift1(){//外籍晚班2
        Person f = new Person();
        System.out.println("19:5" + f.a + "\t" + "22:0" + f.b + "\t" + "22:5" + f.c + "\t" + "03:0" + f.d + "\t" + "03:5" + f.e + "\t" + "08:0" + f.f);
    }
    void nursenightshift(){//護士小夜
        Person g = new Person();
        System.out.println("15:5" + g.a + "\t" + "20:0" + g.b + "\t" + "20:5" + g.c + "\t" + "01:0" + g.d);
    }
    void Nursesbignightshift(){//護士大夜
        Person h = new Person();
        System.out.println("23:5" + h.a + "\t" + "04:0" + h.b + "\t" + "04:5" + h.c + "\t" + "09:0" + h.d);
    }
    void taiwanesemorningshift2(){//台灣早班2
        Person j = new Person();
        System.out.println("07:5" + j.a + "\t" + "10:0" + j.b + "\t" + "10:5" + j.c + "\t" + "15:0" + j.d + "\t" + "15:5" + j.e + "\t" + "18:0" + j.f);
    }
    void taiwanesenightshift1(){//台灣夜班1
        Person k = new Person();
        System.out.println("19:5" + k.a + "\t" + "00:0" + k.b + "\t" + "01:5" + k.c + "\t" + "06:0" + k.d );
    }
    void taiwanesenightshift2(){//台灣夜班2
        Person l = new Person();
        System.out.println("19:5" + l.a + "\t" + "22:0" + l.b + "\t" + "22:5" + l.c + "\t" + "03:0" + l.d + "\t" + "03:5" + l.e + "\t" + "06:0" + l.f);

    }
}











