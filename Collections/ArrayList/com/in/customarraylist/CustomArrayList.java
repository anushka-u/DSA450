package  com.in.customarraylist;
import  java.util.*;
public class CustomArrayList {

    Object arr[] = null;
    int index = 0;

    //A zero param constructor to create an arrayList with default size of 10
    public CustomArrayList(){
        arr = new Object[10];
    }

    //Param Constructor to create an arrayList with given size
    public CustomArrayList(int size)
    {
        arr = new Object[size];
    }

    //Insert method to add elements into ArrayList
    public void insert(Object element)
    {
        if(index>=0)
        {
        	grow();
        }
        //Inserting an element at index
        arr[index] = element;
        //increasing size of index
        index+=1;
    }

    public void grow()
    {
    	int capacity = arr.length+ (arr.length /2);
    	Object brr[] = new Object[capacity];
    	for(int i=0;i<arr.length;i++)
    	{
    		brr[i]=arr[i];
    	}
    	arr=brr;
        
    }
}
