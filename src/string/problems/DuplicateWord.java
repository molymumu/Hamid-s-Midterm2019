package string.problems;

import java.util.*;

/**
 * Created by mrahman on 04/22/17.
 */
public class DuplicateWord {

    public static void main(String[] args) {
        /*
         * Write a java program to find the duplicate words and their number of occurrences in the string.
         * Also Find the average length of the words.
         */

        String st = "Java is a programming Language. Java is also an Island of Indonesia. Java is widely used language";
String[] word =st.split(" ");
        List<String> words = Arrays.asList(word);
        Set<String> duplicates = new HashSet<>(words);
        double total = 0.0;
        int divisor = word.length;
        for (String s:duplicates){
            System.out.println(s + " number of occurences " + Collections.frequency(words, s));

        }
        for ( String m:word){
            total += m.length();
        }
        System.out.println("the average length of the words are:  " +  (total/divisor));
    }

}
