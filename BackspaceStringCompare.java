
import java.util.*;

class BackspaceStringCompare {

    public static String build(String str) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch == '#') {
                if (sb.length() > 0) {
                    sb.deleteCharAt(sb.length() - 1);
                }
            } else {
                sb.append(ch);
            }
        }

        return sb.toString();
    }

    public static boolean backspaceCompare(String s, String t) {
        return build(s).equals(build(t));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String s = sc.nextLine();

        System.out.print("Enter second string: ");
        String t = sc.nextLine();

        boolean result = backspaceCompare(s, t);

        System.out.println("Strings are equal: " + result);

        sc.close();
    }
}