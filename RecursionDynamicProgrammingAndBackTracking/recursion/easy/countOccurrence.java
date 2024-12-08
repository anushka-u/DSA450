package recursion.easy;

public class countOccurrence {

    static int count = 0;

    public static int countOccurrenceOfChar(String str,char ele)
    {
        if(str.isEmpty())
            return count;

        char current = str.charAt(str.length()-1);
        if(current==ele)
        {
            count+=1;
        }
        return countOccurrenceOfChar(str.substring(0,str.length()-1),ele);
    }

    public static void main(String[] args) {
        String str = "hello";
        System.out.println(countOccurrenceOfChar(str,'l'));
    }
}
