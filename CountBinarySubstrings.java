import java.util.*;

class CountBinarySubstrings {

    public static int countBinarySubstrings(String s) {

        int ans = 0;
        int prev = 0;
        int curr = 1;

        for (int i = 1; i < s.length(); i++) {

            if (s.charAt(i) == s.charAt(i - 1)) {
                curr++;
            } else {
                ans += Math.min(prev, curr);

                prev = curr;
                curr = 1;
            }
        }

        ans += Math.min(prev, curr);

        return ans;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter binary string: ");
        String s = sc.nextLine();

        int result = countBinarySubstrings(s);

        System.out.println("Count of binary substrings = " + result);

        sc.close();
    }
}
