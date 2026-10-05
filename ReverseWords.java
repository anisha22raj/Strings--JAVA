import java.util.*;

class ReverseWords {

    public static String reverseWords(String s) {

        char[] arr = s.toCharArray();

        int start = 0;

        for (int i = 0; i <= arr.length; i++) {

            if (i == arr.length || arr[i] == ' ') {

                int left = start;
                int right = i - 1;

                while (left < right) {

                    char temp = arr[left];
                    arr[left] = arr[right];
                    arr[right] = temp;

                    left++;
                    right--;
                }

                start = i + 1;
            }
        }

        return new String(arr);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String s = sc.nextLine();

        String result = reverseWords(s);

        System.out.println("Result: " + result);

        sc.close();
    }
}