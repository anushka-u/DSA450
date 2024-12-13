package recursion.easy;

public class MaximumOccurringCharacter {

    public static Character maximumOccurring(String str, int max, char ch){
        if(str.isEmpty())
        {
            return ch;
        }

        char currentChar = str.charAt(str.length()-1);
//        Character maxOccur = Character.valueOf('\0');
        int count = 0;
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)==currentChar)
            {
                count+=1;

                if(count>max)
                {
                    max=count;
                    ch = str.charAt(i);
                }
            }
        }

        return maximumOccurring(str.substring(0,str.length()-1),max,ch);
    }

    public static void main(String[] args) {
        String str = "apple";
        System.out.println(maximumOccurring(str,-1,'\0'));
    }
}
