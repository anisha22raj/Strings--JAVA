import java.util.*;

public class MostCommonWord {
    public static String mostCommonWord(String paragraph, String[] banned) {
        Set<String> bannedWords = new HashSet<>(Arrays.asList(banned));
        Map<String, Integer> count = new HashMap<>();

        String[] words = paragraph.toLowerCase().split("[^a-z]+");

        String answer = "";
        int maxCount = 0;

        for (String word : words) {
            if (word.isEmpty() || bannedWords.contains(word)) {
                continue;
            }

            int frequency = count.getOrDefault(word, 0) + 1;
            count.put(word, frequency);

            if (frequency > maxCount) {
                maxCount = frequency;
                answer = word;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter paragraph: ");
        String paragraph = sc.nextLine();

        System.out.print("Enter number of banned words: ");
        int n = Integer.parseInt(sc.nextLine());

        String[] banned = new String[n];

        System.out.println("Enter banned words:");
        for (int i = 0; i < n; i++) {
            banned[i] = sc.nextLine().toLowerCase();
        }

        System.out.println("Most common word: "
                + mostCommonWord(paragraph, banned));

        sc.close();
    }
}