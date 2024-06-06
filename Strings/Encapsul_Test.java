// class Student {
// private int age;
// private String name;

// Student(int age, String name) {
// this.name = name;
// this.age = age;
// }

// public int getAge() {
// return age;
// }

// public String getName() {
// return name;
// }

// public void show() {
// System.out.println(name + " " + age);
// }
// }

// public class Encapsul_Test {
// public static void main(String[] args) {
// Student obj = new Student(23, "Ashish");
// Student obj1 = new Student(20, "Prabhat");
// System.out.println(obj1);
// // obj.age = 23;
// // obj.name = "Ashish";
// // obj.setAge(21);
// // obj.setName("Ashish");
// // obj1.setName("Prabhat");
// // obj1.setAge(19);
// // System.out.println(obj.name);
// // System.out.println(obj.age);
// }
// }
// *******************************************************2nd_Question*************************************/
class Student {
    private int a;
    private String name;

    void disp(int a, String name) {
        System.out.println(a);
        System.out.println(name);

    }
}

public class Encapsul_Test {
    public static void main(String[] args) {
        Student obj1 = new Student();
        obj1.disp(19, "Ashish");
    }
}