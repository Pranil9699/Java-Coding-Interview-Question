
import java.util.*;

public class AdvanceStringProblems {

    // 13. Remove Consecutive Duplicate Characters
    static String removeConsecutiveDuplicates(String s) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (i == 0 || s.charAt(i) != s.charAt(i - 1)) {
                result.append(s.charAt(i));
            }
        }
        return result.toString();
    }

    // 14. Extract Numbers and Sum Them
    static int sumOfNumbers(String s) {
        int sum = 0;
        String num = "";
        for (char ch : s.toCharArray()) {
            if (Character.isDigit(ch)) {
                num += ch;
            } else if (!num.isEmpty()) {
                sum += Integer.parseInt(num);
                num = "";
            }
        }
        if (!num.isEmpty()) {
            sum += Integer.parseInt(num);
        }
        return sum;
    }

    // 15. Count Char Types
    static void countCharTypes(String s) {
        int upper = 0, lower = 0, digit = 0, special = 0;
        for (char ch : s.toCharArray()) {
            if (Character.isUpperCase(ch)) upper++;
            else if (Character.isLowerCase(ch)) lower++;
            else if (Character.isDigit(ch)) digit++;
            else special++;
        }
        System.out.println("Uppercase: " + upper);
        System.out.println("Lowercase: " + lower);
        System.out.println("Digits: " + digit);
        System.out.println("Special: " + special);
    }

    // 16. Title Case Conversion
    static String toTitleCase(String sentence) {
        String[] words = sentence.split(" ");
        StringBuilder sb = new StringBuilder();
        for (String word : words) {
            if (!word.isEmpty()) {
                sb.append(Character.toUpperCase(word.charAt(0)))
                  .append(word.substring(1).toLowerCase()).append(" ");
            }
        }
        return sb.toString().trim();
    }

    // 17. Balanced Parentheses
    static boolean isBalanced(String expr) {
        Stack<Character> stack = new Stack<>();
        for (char ch : expr.toCharArray()) {
            if (ch == '(') stack.push(ch);
            else if (ch == ')') {
                if (stack.isEmpty()) return false;
                stack.pop();
            }
        }
        return stack.isEmpty();
    }

    // 18. Missing Letters
    static String missingLetters(String s) {
        s = s.toLowerCase();
        Set<Character> set = new HashSet<>();
        for (char ch : s.toCharArray()) {
            if (Character.isLetter(ch)) set.add(ch);
        }
        StringBuilder missing = new StringBuilder();
        for (char ch = 'a'; ch <= 'z'; ch++) {
            if (!set.contains(ch)) missing.append(ch);
        }
        return missing.toString();
    }

    // 19. Compare Version Numbers
    static String compareVersions(String v1, String v2) {
        String[] a = v1.split("\\.");
        String[] b = v2.split("\\.");
        int len = Math.max(a.length, b.length);
        for (int i = 0; i < len; i++) {
            int num1 = i < a.length ? Integer.parseInt(a[i]) : 0;
            int num2 = i < b.length ? Integer.parseInt(b[i]) : 0;
            if (num1 > num2) return "Version 1 is greater";
            else if (num1 < num2) return "Version 2 is greater";
        }
        return "Versions are equal";
    }

    // 20. Rearrange Characters so No Two Adjacent Are Same
    static boolean rearrangeString(String s) {
        int[] freq = new int[26];
        for (char ch : s.toCharArray()) freq[ch - 'a']++;

        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> b[1] - a[1]);
        for (int i = 0; i < 26; i++) {
            if (freq[i] > 0) pq.add(new int[]{i, freq[i]});
        }

        StringBuilder result = new StringBuilder();
        int[] prev = {-1, 0};

        while (!pq.isEmpty()) {
            int[] curr = pq.poll();
            result.append((char) (curr[0] + 'a'));
            curr[1]--;

            if (prev[1] > 0) pq.add(prev);
            prev = curr;
        }

        return result.length() == s.length();
    }

    // Test all functions
    public static void main(String[] args) {
        System.out.println("13: " + removeConsecutiveDuplicates("aaabbccdaa"));
        System.out.println("14: " + sumOfNumbers("abc12de3"));
        countCharTypes("Hello123@World!");
        System.out.println("16: " + toTitleCase("this is java"));
        System.out.println("17: Balanced? " + isBalanced("((a+b)*(c-d))"));
        System.out.println("18: " + missingLetters("abcdef"));
        System.out.println("19: " + compareVersions("1.2.0", "1.2"));
        System.out.println("20: Can rearrange? " + rearrangeString("aaabbc"));
    }
}
