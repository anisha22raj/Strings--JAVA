import java.util.*;

class DetectCapital {

    public static boolean detectCapitalUse(String word) {

        int count = 0;
        int n = word.length();

        for (int i = 0; i < n; i++) {

            if (Character.isUpperCase(word.charAt(i))) {
                count++;
            }
        }

        if (count == n || count == 0) {
            return true;
        }

        return count == 1 && Character.isUpperCase(word.charAt(0));
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a word: ");
        String word = sc.nextLine();

        boolean result = detectCapitalUse(word);

        System.out.println("Correct capital usage: " + result);

        sc.close();
    }
}