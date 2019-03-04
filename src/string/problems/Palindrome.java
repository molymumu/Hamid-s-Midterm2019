package string.problems;

public class Palindrome {
    public static void main(String[] args) {
        /*
          If a String is reversed and it remains unchanged, that is called Palindrome. For example, MOM,DAD,MADAM are
          Palindrome. So write java code to check if a given String is Palindrome or not.
         */
        String wordOne = "MOM";
        String wordTwo = "DAD";
        String wordThree = "MADAM";
        String wordFour = "calculator";
        String wordFive ="Hamid";
        System.out.println(isPalindrome(wordOne));
        System.out.println(isPalindrome(wordTwo));
        System.out.println(isPalindrome(wordThree));
        System.out.println(isPalindrome(wordFour));
        System.out.println(isPalindrome(wordFive));
    }
    public static boolean isPalindrome(String word){
        String actualWord = word.toLowerCase();
        String reverseWord= "";
        for(int i = actualWord.length()-1; i>=0; i--){
            reverseWord=reverseWord+actualWord.charAt(i);
        }
        if (actualWord.equals(reverseWord)){
            return true;

        }else{
            return false;
        }
    }
}



