import java.util.*;

class ValidPalindrome {

    public static boolean isPalindrome(String s) {

        int left = 0;
        int right = s.length() - 1;

        while (left < right) {

            // Skip non-letter and non-digit characters from left
            while (left < right &&
                   !Character.isLetterOrDigit(s.charAt(left))) {
                left++;
            }

            // Skip non-letter and non-digit characters from right
            while (left < right &&
                   !Character.isLetterOrDigit(s.charAt(right))) {
                right--;
            }

            // Compare characters ignoring case
            if (Character.toLowerCase(s.charAt(left)) !=
                Character.toLowerCase(s.charAt(right))) {

                return false;
            }

            left++;
            right--;
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String s = sc.nextLine();

        boolean result = isPalindrome(s);

        System.out.println("Is palindrome: " + result);

        sc.close();
    }
}