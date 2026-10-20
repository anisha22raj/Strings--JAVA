import java.util.*;

public class RotateString {
    public static boolean rotateString(String s, String goal) {
        if (s.length() != goal.length()) {
            return false;
        }

        return (s + s).contains(goal);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter string s: ");
        String s = sc.nextLine();

        System.out.print("Enter string goal: ");
        String goal = sc.nextLine();

        System.out.println(rotateString(s, goal));

        sc.close();
    }
}