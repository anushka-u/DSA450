package recursion.easy;

public class RemoveOccurrenceOfACharacter {

    static  String temp="";
    public static void removeOccurrence(String str, char ch)
    {
        if(str.isEmpty())
            return;

        if(str.charAt(str.length()-1)!=ch)
        {
            temp=str.charAt(str.length()-1)+temp;
        }

        removeOccurrence(str.substring(0,str.length()-1),ch);
    }

    public static void main(String[] args) {
        String str = "hello world";
        removeOccurrence(str,'l');
        System.out.println(temp);
    }
}
