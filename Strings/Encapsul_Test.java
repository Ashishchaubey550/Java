class Student {
    private int age;
    private String name;

    public void setData() {
        age = 23;
        name = "Ashish";
    }

    public void show() {
        System.out.println(name + " " + age);
    }
}

public class Encapsul_Test {
    public static void main(String[] args) {
        Student obj = new Student();
        // obj.age = 23;
        // obj.name = "Ashish";
        obj.setData();
        obj.show();
        // System.out.println(obj.name);
        // System.out.println(obj.age);

    }
}
