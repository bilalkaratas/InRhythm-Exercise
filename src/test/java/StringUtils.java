

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;




public class StringUtils {



    public static void showLongestWords(String sentence) {
        System.out.println(lengthOfLongestWord(sentence));
        for (String each : longestWords(sentence)){
            System.out.println(each);
        }
    }

    public static List<String> getCleanedList(String sentence){
        sentence = sentence.replaceAll("[^a-zA-Z]", " ");     // to remove all the numbers and punctuation characters
        return Arrays.asList(sentence.split(" "));
    }

    public static int lengthOfLongestWord(String sentence) {
        List<String> list = getCleanedList(sentence);
        int maxLength = 0;
        for(String each:list){
            if(each.length()>maxLength){
                maxLength = each.length();
            }
        }
        return maxLength;
    }

    public static List<String> longestWords(String sentence) {
        List<String> list = getCleanedList(sentence);
        int maxLength = lengthOfLongestWord(sentence);
        List<String> words = new ArrayList<>();
        for(String each:list){
            if(each.length()==maxLength){
                words.add(each);
            }
        }
        return words;
    }

}
