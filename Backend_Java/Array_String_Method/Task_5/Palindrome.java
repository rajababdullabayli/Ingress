package Task_5;

public class Palindrome {
    public boolean isPalindrome(String text){
        String palindrome = "";
        for (char c : text.toCharArray()){
            palindrome=c+palindrome;
        }
        if (text.toLowerCase().equals(palindrome.toLowerCase())){
            System.out.println("Text is Palindrome text: "+palindrome);
            return true;
        }
        else{
            System.out.println("Text is not Palindrome text: "+palindrome);
            return false;
        }
    }
}
