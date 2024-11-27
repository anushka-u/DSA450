public class numberOfBallons {

    public static void main(String[] args) {

        String str = "nlaebolko";
        int b =0;
        int a = 0;
        int l = 0;
        int o = 0;
        int n = 0;

        for(char ch : str.toCharArray())
        {
            if(ch=='b')
            {
                b++;
            }
            else if(ch == 'a')
            {
                a++;
            }
            else if(ch =='l')
            {
                l++;
            }
            else if(ch=='o')
            {
                o++;
            } else if (ch=='n') {
                n++;

            }
        }

//        System.out.println(a);
//        System.out.println(b);
//        System.out.println(l);
//        System.out.println(o);
//        System.out.println(n);

        if(b==0 || a ==0 || l==0 || o==0||n==0)
        {
            //System.out.println("Inside 0 if");
            System.out.println("No possible string");
        }

        int minSingleChar = Math.min(b,Math.min(a,n));
       // System.out.println("Min single char "+minSingleChar);
        int minDoubleChar = Math.min(l,o);
      //  System.out.println("Min double char "+minDoubleChar);
        minDoubleChar/=2;

        System.out.println("Possible balloon Strings are "+ Math.min(minSingleChar,minDoubleChar));

    }
}
