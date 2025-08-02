import java.util.*;

public class StringProblems {

    // 6. Group Anagrams
    public static List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for (String word : strs) {
            char[] chars = word.toCharArray();
            Arrays.sort(chars);
            String sorted = new String(chars);
            map.computeIfAbsent(sorted, k -> new ArrayList<>()).add(word);
        }
        return new ArrayList<>(map.values());
    }

    // 7. Run-Length Encoding
    public static String compressString(String str) {
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while (i < str.length()) {
            char ch = str.charAt(i);
            int count = 1;
            while (i + 1 < str.length() && str.charAt(i + 1) == ch) {
                count++;
                i++;
            }
            sb.append(ch).append(count);
            i++;
        }
        return sb.toString();
    }

    // 8. Convert Sentence to CamelCase
    public static String toCamelCase(String sentence) {
        String[] words = sentence.trim().split("\\s+");
        StringBuilder sb = new StringBuilder(words[0].toLowerCase());
        for (int i = 1; i < words.length; i++) {
            sb.append(Character.toUpperCase(words[i].charAt(0)))
              .append(words[i].substring(1).toLowerCase());
        }
        return sb.toString();
    }

    // 9. Count Words Ending with a Vowel
    public static int countWordsEndingWithVowel(String sentence) {
        String[] words = sentence.trim().split("\\s+");
        int count = 0;
        for (String word : words) {
            char lastChar = word.toLowerCase().charAt(word.length() - 1);
            if ("aeiou".indexOf(lastChar) != -1) count++;
        }
        return count;
    }

    // 10. Check Rotation
    public static boolean isRotation(String s1, String s2) {
        return s1.length() == s2.length() && (s1 + s1).contains(s2);
    }

    // 11. Common Characters
    public static Set<Character> commonCharacters(String s1, String s2) {
        Set<Character> result = new HashSet<>();
        for (char ch : s1.toCharArray()) {
            if (s2.indexOf(ch) != -1) result.add(ch);
        }
        return result;
    }

    // 12. Pattern Match
    public static boolean followsPattern(String pattern, String str) {
        String[] words = str.split(" ");
        if (words.length != pattern.length()) return false;

        Map<Character, String> map1 = new HashMap<>();
        Map<String, Character> map2 = new HashMap<>();

        for (int i = 0; i < pattern.length(); i++) {
            char c = pattern.charAt(i);
            String w = words[i];

            if (!map1.containsKey(c)) map1.put(c, w);
            if (!map2.containsKey(w)) map2.put(w, c);

            if (!map1.get(c).equals(w) || map2.get(w) != c) return false;
        }

        return true;
    }

    // Main Method for Testing
    public static void main(String[] args) {
        System.out.println("6. Group Anagrams: " + groupAnagrams(new String[]{"bat", "tab", "cat", "act"}));
        System.out.println("7. Compress: " + compressString("aaabbcc"));
        System.out.println("8. CamelCase: " + toCamelCase("hello world good morning"));
        System.out.println("9. Words ending with vowel: " + countWordsEndingWithVowel("Pranil is amazing"));
        System.out.println("10. Rotation: " + isRotation("ABCD", "CDAB"));
        System.out.println("11. Common Chars: " + commonCharacters("apple", "grape"));
        System.out.println("12. Follows Pattern: " + followsPattern("abba", "dog cat cat dog"));
    }
}
