package recursion.easy;

public class ReplaceVowels {

    static String temp="";
    public static void replaceVowels(String str)
    {
        if(str.isEmpty())
        {
            return;
        }
        if(str.charAt(str.length()-1)=='a' || str.charAt(str.length()-1)=='e' ||
        str.charAt(str.length()-1)=='i' || str.charAt(str.length()-1)=='o'
        ||str.charAt(str.length()-1)=='u')
        {
            temp='*'+temp;
        }
        else{
            temp=str.charAt(str.length()-1)+temp;
        }

        replaceVowels(str.substring(0,str.length()-1));
    }

    public static void main(String[] args) {
        String str = "apple";
        replaceVowels(str);
        System.out.println(temp);
    }
}
