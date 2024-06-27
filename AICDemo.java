interface Car {
    void drive();
}

public class AICDemo {
    public static void main(String[] args) {
        Car obj1 = () -> System.out.println("Ashish chaubey");
        obj1.drive();
    }
}