import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TextAnalizer {




    // Count total characters
    static int countCharacters(String text) {
        return text.length();
    }

    // Count total words
    static int countWords(String text) {

        if (text.trim().isEmpty()) {
            return 0;
        }

        String[] words = text.trim().split("\\s+");

        return words.length;
    }

    // Count vowels
    static int countVowels(String text) {

        int count = 0;

        text = text.toLowerCase();

        for (int i = 0; i < text.length(); i++) {

            char ch = text.charAt(i);

            if (ch == 'a' || ch == 'e' || ch == 'i' ||
                ch == 'o' || ch == 'u') {

                count++;
            }
        }

        return count;
    }

    // Count consonants
    static int countConsonants(String text) {

        int count = 0;

        text = text.toLowerCase();

        for (int i = 0; i < text.length(); i++) {

            char ch = text.charAt(i);

            if (ch >= 'a' && ch <= 'z' &&
                ch != 'a' && ch != 'e' && ch != 'i' &&
                ch != 'o' && ch != 'u') {

                count++;
            }
        }

        return count;
    }

    // Find most frequently used character
    static char mostFrequentCharacter(String text) {

        Map<Character, Integer> freq = new HashMap<>();

        text = text.toLowerCase();

        for (int i = 0; i < text.length(); i++) {

            char ch = text.charAt(i);

            if (ch != ' ') {
                freq.put(ch, freq.getOrDefault(ch, 0) + 1);
            }
        }

        char maxChar = '\0';
        int maxCount = 0;

        for (Map.Entry<Character, Integer> entry : freq.entrySet()) {

            if (entry.getValue() > maxCount) {

                maxCount = entry.getValue();
                maxChar = entry.getKey();
            }
        }

        return maxChar;
    }

    // Search for a word
    static boolean searchWord(String text, String word) {

        String[] words = text.toLowerCase().trim().split("\\s+");

        for (String w : words) {

            if (w.equals(word.toLowerCase())) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("===== TEXT ANALYZER =====");

        System.out.println("Enter your text:");
        String text = sc.nextLine();

        System.out.println("\nTotal characters: " + countCharacters(text));

        System.out.println("Total words: " + countWords(text));

        System.out.println("Total vowels: " + countVowels(text));

        System.out.println("Total consonants: " + countConsonants(text));

        if (text.replace(" ", "").isEmpty()) {
            System.out.println("Most frequent character: No characters");
        } else {
            System.out.println("Most frequent character: " +
                    mostFrequentCharacter(text));
        }

        System.out.println("\nEnter a word to search:");
        String word = sc.nextLine();

        if (searchWord(text, word)) {
            System.out.println("Word found!");
        } else {
            System.out.println("Word not found!");
        }

        sc.close();
    }
}


