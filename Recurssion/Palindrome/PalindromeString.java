public class PalindromeString {
    public static boolean palindrome(String str, int i, int j)
    {
        if(str.length()==0)
        {
            return true;
        }
        if(i>=j)
        {
            return true;
        }
        if(str.charAt(i)!=str.charAt(j))
        {
            return false;
        }

        return palindrome(str,i+1,j-1);

    }
    public static void main(String[] args) {

        String str = "dalad";
        if(palindrome(str,0,str.length()-1))
        {
            System.out.println("Is PAlindrome");
        }
        else{
            System.out.println("Not a Palindrome");
        }

    }
}
