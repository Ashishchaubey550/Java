
class animal {

    void sleep() {
        System.out.println("Animal Need Sleep Also ): ");
    }
}

class Tiger extends animal {

}

public class Single_Inher {
    public static void main(String[] args) {
        Tiger tig = new Tiger();
        tig.sleep();
    }
}
// Single Inheritence means one class Inheritence Other class
