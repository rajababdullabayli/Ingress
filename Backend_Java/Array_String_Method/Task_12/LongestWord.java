package Task_12;

public class LongestWord {
    public void findLongestWord(String sentence) {
        String[] words = sentence.split(" ");
        String longestWord = words[0];

        for (String word : words) {
            if (word.length() > longestWord.length()) {
                longestWord = word;
            }
        }
        System.out.println("The longest word: " + longestWord +
                " (" + longestWord.length() + " letters)");
    }
}
