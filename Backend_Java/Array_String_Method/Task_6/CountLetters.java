package Task_6;

public class CountLetters {
    public void countLetters(String text) {
        //banana
        //b-1
        //a-3
        //n-2
        String visited = "";
        for (char c : text.toCharArray()) {
            if (visited.indexOf(c) == -1) {
                int countChar = 0;
                for (char nc : text.toCharArray()) {
                    if (c == nc) {
                        countChar++;
                    }
                }
                System.out.println(c + ": " + countChar);
                visited += c;
            }
        }
    }
}
