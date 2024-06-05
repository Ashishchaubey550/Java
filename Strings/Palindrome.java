public class Palindrome {
    public static void main(String[] args) {
        String Str1 = "Level_Sabke_Niklnge_Pr_Niklnga_usike_Jo_Khda_rhega";
        // String Str1 = "level";
        String Str2 = "";
        for (int i = Str1.length() - 1; i >= 0; i--) {
            Str2 = Str2 + Str1.charAt(i);
        }
        System.out.println(Str2);
        if (Str1.equals(Str2)) {
            System.out.println("Yes It is Palindrome");
        } else {
            System.out.println("It is not a Palindrome");
        }
    }
}
