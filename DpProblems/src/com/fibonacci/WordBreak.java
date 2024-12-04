package src.com.fibonacci;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//To understand the solution better : Debug on ur own -> debug and watch how the problem is dividing into subproblem and how it's breaking into pieces.
public class WordBreak {

    static boolean wordBreaking(List<String> wordList, String word){
        if(word.isEmpty())
        {
            return true;
        }
        int wordLength = word.length();
        for(int i=1;i<=wordLength;i++)
        {
            String prefix = word.substring(0,i);

            if(wordList.contains(prefix) &&  wordBreaking(wordList,word.substring(i)))
            {
                return true;
            }
        }
        return false;
    }

    public  static  void main(String... args)
    {
//        List<String> wordList = new ArrayList<>(Arrays.asList("I","Like","Sam","Sung","Samsung"));
//        String word = "ILikeSamSung";
//        System.out.println(wordBreaking(wordList,word));

        List<String> wordList2 = new ArrayList<>(Arrays.asList("I","Love","Ice","cream","Icecream"));
        String word2 = "ILoveIcecream";
        System.out.println(wordBreaking(wordList2,word2));
    }
}
