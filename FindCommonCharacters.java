import java.util.*;

public class FindCommonCharacters {
    public static List<String> commonChars(String[] words) {
        int[] common = new int[26];
        Arrays.fill(common, Integer.MAX_VALUE);

        for (String word : words) {
            int[] count = new int[26];

            for (char c : word.toCharArray()) {
                count[c - 'a']++;
            }

            for (int i = 0; i < 26; i++) {
                common[i] = Math.min(common[i], count[i]);
            }
        }

        List<String> result = new ArrayList<>();

        for (int i = 0; i < 26; i++) {
            for (int j = 0; j < common[i]; j++) {
                result.add(String.valueOf((char) ('a' + i)));
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of words: ");
        int n = sc.nextInt();
        sc.nextLine();

        String[] words = new String[n];

        System.out.println("Enter lowercase words:");
        for (int i = 0; i < n; i++) {
            words[i] = sc.nextLine();
        }

        System.out.println("Common characters: " + commonChars(words));

        sc.close();
    }
}