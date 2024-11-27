import java.util.LinkedHashMap;
import java.util.Map;

public class NonRepeatingChar {
    public static void main(String[] args) {
        String str = "racecar";
        Map<Character,Integer> countOccu = new LinkedHashMap<>();
        for(int i =0;i<str.length();i++)
        {
            char ch = str.charAt(i);
            if(countOccu.containsKey(ch))
            {
                countOccu.put(ch,countOccu.get(ch)+1);
            }
            else {
                countOccu.put(ch,1);
            }
        }
        char ch =' ';
        for(Map.Entry<Character,Integer> entry : countOccu.entrySet())
        {
            if(entry.getValue()==1)
            {
                ch=entry.getKey();
                break;
            }
        }
        if(ch==' ')
        {
            System.out.println("No character with occurrence 1");
        }
        else{
            System.out.println(ch);
        }
    }
}
