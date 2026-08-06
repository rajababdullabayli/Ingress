package Task_9;

public class Anagram {
    public boolean areAnagrams(String text1, String text2) {
        int charcount = 0;
        for (char ch1 : text1.toCharArray()) {
            if (text2.indexOf(ch1) != -1) {
                charcount++;
            }
        }
        if (text1.length() == charcount) {
            return true;
        } else {
            return false;
        }
    }
}
