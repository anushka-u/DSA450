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

    public Object get(int indexFind)
    {
    	return arr[indexFind];
    }
    //Insert method to add elements into ArrayList
    public void insert(Object element)
    {
        if(index>=arr.length)
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
    	int capacity = arr.length+ (arr.length/2);
    	Object brr[] = new Object[capacity];
    	for(int i=0;i<arr.length;i++)
    	{
    		brr[i]=arr[i];
    	}
    	arr=brr;
        
    }
    
    //Custom Remove() method - space complexity = O(n) and using arraycopy() with sc = O(1)
    public Object remove(int indexToBeRemoved) throws Exception{
    	
//    	if(indexToBeRemoved>arr.length)
//    	{
//    		throw new IndexOutOfBoundsException("Index Out of Bound");
//    	}
    	
    	Object ob = get(indexToBeRemoved);
//    	Object brr[] = new Object[arr.length-1];
//    	
//    	for(int i=0;i<arr.length-1;i++)
//    	{
//    		if(i< indexToBeRemoved)
//    		{
//    			brr[i] = arr[i];
//    		}
//    		else
//    		{
//    			brr[i]=arr[i+1];
//    		}
//    	}
    	//arr=brr;
    	
    	//formula to calculate number of shift operation
    	int noOfShiftOperation = arr.length - indexToBeRemoved -1;
    	
    	if(noOfShiftOperation>0)
    	{
    		System.arraycopy(arr, indexToBeRemoved+1, arr, indexToBeRemoved, noOfShiftOperation);
    	}
    	index--;
    	arr[index]=null;
    	
    	
    	
    	return ob;
    }
    
    public void PrintArray() {
    	for(int i=0;i<arr.length;i++)
    	{
    		if( arr[i] == null) {
    			continue;
    		}
    		System.out.print(arr[i]+ " ");
    	}
    }
}
