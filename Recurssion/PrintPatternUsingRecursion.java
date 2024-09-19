public class PrintPatternUsingRecursion {

    public static void main(String[] args) {
        printPattern(4,0);
    }

    static void printPattern(int row, int column){
        if(row==0){
            return;
        }
        if(row>column){
            System.out.print("*");
            printPattern(row,column+1);
        }
        else{
            System.out.println();  // Move to next line
            printPattern(row-1,0);
        }
    }
}
