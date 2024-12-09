package recursion.medium;

import java.util.HashMap;
import java.util.Map;

public class balancedParanthesis {

    static Map<String,Integer> balanceMap = new HashMap<>();

    public static boolean balanced(String str, int idx, int lastidx){
        if(idx>=lastidx)
        {
            return true;
        }

        char first = str.charAt(idx);
        char last = str.charAt(lastidx);

        if((first=='{' && last=='}')||(first =='[' && last==']') || (first =='(' && last==')') )
        {
            return balanced(str,idx+1,lastidx-1);
        }
        else{
            return false;
        }

    }

    public static void main(String[] args) {
        String str = "{[()]}";
        String str1 = "{[}]()";
        System.out.println(balanced(str,0,str.length()-1));
        System.out.println(balanced(str1,0,str.length()-1));
    }
}
