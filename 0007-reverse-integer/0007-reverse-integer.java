class Solution {
    public int reverse(int x) {
        int rev_num=0;
        int dup=x;
        if(x<0)
        {
            x*=-1;
        }
        while(x>0)
        { 
             if (rev_num > (Integer.MAX_VALUE - x % 10) / 10) {
            // This checks for overflow
            return 0;
            }
            rev_num=rev_num*10+ (x%10);
            x=x/10;
        }
        if(dup<0)
        {
            rev_num*=-1;
        }
        return rev_num;
        
    }
}