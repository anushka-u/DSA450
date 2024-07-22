class Solution {
    public boolean checkPerfectNumber(int num) {
       int n=1;
       int perfect_Num=0;
       while(n<=num/2)
       {
        if(num%n==0)
        {
            perfect_Num+=n;
        }
        n++;
       }
       return num==perfect_Num;
    }
}