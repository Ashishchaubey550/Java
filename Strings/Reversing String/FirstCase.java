// This is for reverse the word
class FirstCase {
    public static void main(String[] args) {
        // String Str = "Ashish";
        // String str2 = "";
        // for (int i = Str.length() - 1; i >= 0; i--) {
        // str2 = str2 + Str.charAt(i);
        // }
        // System.out.println(str2);

        // for Hello
        // String Str = "Hello";
        // String Str2 = "";
        // for (int i = Str.length() - 1; i >= 0; i--) {
        // Str2 = Str2 + Str.charAt(i);
        // }
        // System.out.println(Str2);

        // For only position change
        // String Str = "Ashish Chaubey";
        // String Str2 = "";
        // String strArray[] = Str.split(" ");
        // for (int i = strArray.length - 1; i >= 0; i--) {
        // Str2 = Str2 + strArray[i] + " ";
        // }
        // System.out.println(Str2);

        // Reversing both Position and char

        String Str = "Ashish Chaubey";
        String Str1 = "";
        String Str2[] = Str.split(" ");
        for (String elem : Str2) {
            // here we have to use enhance for loop to traverson arrays each box and reverse
            // the char and then other box
            for (int i = elem.length() - 1; i >= 0; i--) {
                Str1 = Str1 + elem.charAt(i);
            }
            Str1 = Str1 + " ";
        }
        System.out.println(Str1);
    }
}
