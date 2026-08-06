package Task_8;

public class TitleCase {
    public String toTitleCase(String text ){

        StringBuilder titleText = new StringBuilder();
        String[] words = text.split(" ");
        for (String word : words){
            String captalizeword = word.substring(0,1).toUpperCase()+word.substring(1);
            titleText.append(captalizeword).append(" ");
        }
        return titleText.toString();
    }
}
