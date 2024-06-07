class Human {
    int age;
    private String name;

    void sleep() {
        age = 19;
        System.out.println("Human Need Good Sleep");
        System.out.println(age);
    }

    Human() {
        System.out.println("Human Class Constructor");
    }

}

class Student extends Human {
    // pov Human:
    // Tujhme_bhi_mei hu;
    void desp() {
        System.out.println("The age is " + age);
    }
}

public class First {
    public static void main(String[] args) {
        System.out.println("Hello");
        Student obj = new Student();
        obj.sleep();

    }
}
