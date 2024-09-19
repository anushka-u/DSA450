public class ArraySortedOrNot {

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        boolean isSorted = isSorted(array,0);
        System.out.println(isSorted);

        int[] brr = {1,4,3,5,6};
        System.out.println(isSorted(brr,0));
    }

    static boolean isSorted(int[] array, int index) {
        if(index==array.length-1) return true;

        return array[index]<array[index+1] && isSorted(array,index+1);
    }
}
