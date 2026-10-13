import java.util.*;

class LengthOfLastWord {

    public static int lengthOfLastWord(String s) {

        int i = s.length() - 1;
        int count = 0;

        while (i >= 0 && s.charAt(i) == ' ') {
            i--;
        }

        while (i >= 0 && s.charAt(i) != ' ') {
            count++;
            i--;
        }

        return count;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String s = sc.nextLine();

        int result = lengthOfLastWord(s);

        System.out.println("Length of last word = " + result);

        sc.close();
    }
}
