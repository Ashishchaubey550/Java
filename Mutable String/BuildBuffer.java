// public class BuildBuffer {
// public static void main(String[] args) {
// StringBuffer Str1 = new StringBuffer("MS");
// System.out.println(Str1);
// // StringBuffer Str1 = "Ashish"; invalid syntex
// Str1 = Str1.append(" Dhoni");
// System.out.println(Str1);
// }
// }
// public class BuildBuffer {
// public static void main(String[] args) {
// StringBuilder Str1 = new StringBuilder("MS");
// System.out.println(Str1);
// // StringBuffer Str1 = "Ashish"; invalid syntex
// Str1 = Str1.append(" Dhoni");
// System.out.println(Str1);
// }
// }
// ***********************************Final Vs
// Immutable*****************************************

// public class BuildBuffer {
//     public static void main(String[] args) {
//         final int a = 10;
//         a = 20;
//         System.out.println(a);

//     }
// }

public class BuildBuffer {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        System.out.println(sb.capacity());
        sb.append("abababababababajl");
        System.out.println(sb.capacity());

    }
}