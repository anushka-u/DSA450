import java.util.Scanner;

public class PrintFromStart {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        printFromStart(n);
    }
    static void printFromStart(int n){
        if(n==0)
        {
            return;
        }
        printFromStart(n-1);
        System.out.println(n);
    }
}
