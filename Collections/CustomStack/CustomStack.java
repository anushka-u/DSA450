import java.util.Arrays;
import java.util.StringJoiner;

public class CustomStack {

    public static void main(String[] args) {

        CustomStack cstck =  new CustomStack(3);
        cstck.push(89);
        cstck.push(67);
        cstck.push(78);

        System.out.println(cstck);
        System.out.println(cstck.peek());
        System.out.println(cstck.pop());


    }

        Object[] stk;
        int index =0;

        public CustomStack(){
            stk = new Object[10];
        }
        public CustomStack(int size)
        {
            stk = new Object[size];
        }


        public Boolean  add(Object ob)
        {
            if(index>=stk.length)
            {
                int newSize = stk.length + (stk.length/2);
                stk = Arrays.copyOf(stk,newSize);
            }
            stk[index] = ob;
            index++;
            return true;
        }

        public Object get(int idx)
        {

            return stk[idx];
        }

        public Object remove(int indexToBeRemoved)
        {
            Object obj = get(indexToBeRemoved);

            int noOfShiftOpt = stk.length-indexToBeRemoved-1;
            if(noOfShiftOpt>0)
            {
                System.arraycopy(stk,indexToBeRemoved+1,stk,indexToBeRemoved,noOfShiftOpt);
            }
            index--;
            stk[index] = null;
            return obj;

        }

        public  Object pop()
        {
            return remove(stk.length-1);
        }

        public Object peek()
        {
            return get(stk.length-1);
        }

        public Boolean push(Object obj)
        {
            Boolean flag = add(obj);
            return  flag;
        }

        @Override
        public String toString() {
            StringJoiner sj = new StringJoiner(",","[","]");
            for(int i=0;i<stk.length;i++)
            {
                sj.add(String.valueOf(stk[i]));
            }
            return sj.toString();
        }
}
