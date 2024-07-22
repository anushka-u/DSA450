class Solution {
    public boolean isPalindrome(int x) {
        int rev=0;
        int dup = x;
        if(x<0)
        {
            return false;
        }
        while(dup>0)
        {
            int last_dig = dup%10;
            rev=rev*10+last_dig;
            dup/=10;
        }
        if(rev==x)
        {
            return true;
        }
        else{
            return false;
        }
    }
}