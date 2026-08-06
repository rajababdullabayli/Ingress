package Task_7;

public class Reverse {
    public String recerseString (String text){
        String reverseString = "";
        for (char ch : text.toCharArray()){
            reverseString = ch + reverseString;
        }
        return reverseString;
    }
}
