package recursion.medium;

public class palindrome {

    public static boolean isPalindrome(String str, int first,int last)
    {
        if(str.isEmpty()|| first>=last)
        {
            return true;
        }
        if(str.charAt(first)!=str.charAt(last))
        {
            return false;
        }
        return isPalindrome(str,first+1,last-1);
    }

    public static void main(String[] args) {
        String str = "nitin";
        System.out.println(isPalindrome(str,0,str.length()-1));
    }
}
