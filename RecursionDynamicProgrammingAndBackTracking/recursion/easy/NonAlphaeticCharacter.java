package recursion.easy;

public class NonAlphaeticCharacter {

    public static String removeNonAlphaeticCharacter(String str)
    {
        if(str.isEmpty())
        {
            return "";
        }
        char lastCharacter  =  str.charAt(str.length()-1);
        String result = removeNonAlphaeticCharacter(str.substring(0, str.length() - 1));

        if(Character.isAlphabetic(lastCharacter))
        {
            result+=lastCharacter;
        }
        return result;
    }

    public static void main(String[] args) {
        String str = "He@llo W98orlD#$";
        System.out.println(removeNonAlphaeticCharacter(str));
    }
}
