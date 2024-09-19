import java.util.Scanner;

public class steosToReduceToZero {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();

        System.out.println(ReduceToZero(num));
    }
    static int ReduceToZero(int num)
    {
        if(num==0)
        {
            return 0;
        }
        if(num%2==0)
        {
            return 1+ReduceToZero(num/2);
        }
        return 1+ ReduceToZero(num-1);
    }
}
