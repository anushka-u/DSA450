package recursion.easy;

public class PrintCharactersSeparately {

    public static void printCharacters(String str,int idx)
    {
        if(str.length()==idx)
            return;
        System.out.println(str.charAt(idx));
        printCharacters(str,idx+1);
    }

    public static void main(String[] args) {
        String str = "hello";
        printCharacters(str,0);
    }
}
