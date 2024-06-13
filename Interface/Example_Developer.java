package Interface;

interface Computer {
    void CompileCode();
}

class Laptop implements Computer {
    public void CompileCode() {
        System.out.println("Compling Code In Laptop");
    }
}

class Desktop implements Computer {
    public void CompileCode() {
        System.out.println("Compile code in Desktop");
    }
}

class Developer {
    public void buildApp(Computer obj) {
        System.out.println("Building Application");
        obj.CompileCode();
    }
}

public class Example_Developer {
    public static void main(String[] args) {
        // Laptop obj = new Laptop();
        Computer Desk = new Desktop();
        Developer dev = new Developer();
        dev.buildApp(Desk);
    }
}
