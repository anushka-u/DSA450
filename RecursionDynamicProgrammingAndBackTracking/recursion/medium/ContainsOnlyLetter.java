package recursion.medium;

public class ContainsOnlyLetter {

    public static boolean checkIfStringContainsOnlyLetter(String str)
    {
        if(str.isEmpty())
        {
            return true;
        }
        if(!Character.isLetter(str.charAt(str.length()-1))){
            return false;
        }
        return checkIfStringContainsOnlyLetter(str.substring(0,str.length()-1));
    }

    public static void main(String[] args) {
        String str = "He!!o";
        System.out.println(checkIfStringContainsOnlyLetter(str));
    }
}
