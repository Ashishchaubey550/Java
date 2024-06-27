class Calc {
    public void show() {
        System.out.println("In Show mei");
    }

    class Add {
        public void Addition() {
            System.out.println("In Addition beta ji");
        }

    }
}

public class inner_Demo {
    public static void main(String[] args) {
        Calc obj = new Calc();
        obj.show();
        Calc.Add obj1 = obj.new Add();
        obj1.Addition();
    }
}
