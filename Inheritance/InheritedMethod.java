class Aeroplane {
    public void takeOff() {
        System.out.println("Aeroplane TakeOff");
    }

    public void fly() {
        System.out.println("Aeroplane Fly");
    }
}

class CargoPlane extends Aeroplane {

}

class PassengerPlane extends Aeroplane {
}

public class InheritedMethod {
    public static void main(String[] args) {
        CargoPlane cp = new CargoPlane();
        cp.fly();
        cp.takeOff();
    }
}
