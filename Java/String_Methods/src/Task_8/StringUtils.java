package Task_8;

public class StringUtils {
    private String text;

    public String getText() {
        return text;
    }

    public void setText(String sentence) {
        this.text = sentence;
    }

    public int countLetters(String text) {
        if (text == null) {
            return 0;
        }
        int countLetter = 0;
        for (char c : text.toCharArray()) {
            if (Character.toUpperCase(c) != Character.toLowerCase(c)) {
                countLetter++;
            }
        }
        return countLetter;
    }

    public int countDigits(String text) {
        if (text == null) {
            return 0;
        }
        int countDigit = 0;
        for (char c : text  .toCharArray()) {
            if (Character.isDigit(c)) {
                countDigit++;
            }
        }
        return countDigit;
    }

    public int countSpaces(String text) {
        if (text == null) {
            return 0;
        }
        int countSpace = 0;
        for (char c : text.toCharArray()) {
            if (c == ' ') {
                countSpace++;
            }
        }
        return countSpace;
    }

    public int countSpecialCharacters(String text) {
        if (text == null) {
            return 0;
        }
        int countSpecialCharacter = 0;
        for (char c : text.toCharArray()) {
            if (!Character.isLetterOrDigit(c) && !Character.isWhitespace(c)) {
                countSpecialCharacter++;
            }
        }
        return countSpecialCharacter;
    }
}