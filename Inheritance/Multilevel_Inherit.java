class Demo {
    void disp() {
        System.out.println("Mei Hei Original ");
    }
}

class Demo2 extends Demo {

}

class Demo3 extends Demo2 {

}

public class Multilevel_Inherit {
    public static void main(String[] args) {
        Demo3 obj = new Demo3();
        obj.disp();
    }
}
