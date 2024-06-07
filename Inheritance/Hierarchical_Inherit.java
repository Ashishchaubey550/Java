
class Animal {
    void disp() {
        System.out.println("Animal");
    }
}

class Tiger extends Animal {

}

class Monkey extends Animal {

}

class Lion extends Animal {

}

public class Hierarchical_Inherit {
    public static void main(String[] args) {
        Lion Li = new Lion();
        Li.disp();
        Monkey Mo = new Monkey();
        Mo.disp();
        Tiger Tig = new Tiger();
        Tig.disp();

    }
}
