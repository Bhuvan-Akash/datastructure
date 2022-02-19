package simp;
import java.util.Scanner;  
public class bubbleSort {
	
	    void bubbleSort(int arr[])
	    {
	        int n = arr.length;
	        for (int i = 0; i < n-1; i++)
	            for (int j = 0; j < n-i-1; j++)
	                if (arr[j] > arr[j+1])
	                {
	                     
	                    int temp = arr[j];
	                    arr[j] = arr[j+1];
	                    arr[j+1] = temp;
	                }
	    }
	  
	 
	    void printArray(int arr[])
	    {
	        int n = arr.length;
	        for (int i=0; i<n; ++i)
	            System.out.print(arr[i] + " ");
	        System.out.println();
	    }
	  
	  
	    public static void main(String args[])
	    {int n;  
	    Scanner sc=new Scanner(System.in);  
	    System.out.print("Enter the number of elements in array");  
	    
	    n=sc.nextInt();  
	   
	    int[] array = new int[15];  
	    System.out.println("Enter the elements of the array: ");  
	    for(int i=0; i<n; i++)  
	    {  
	    
	    array[i]=sc.nextInt();  
	    }  
	        bubbleSort ob = new bubbleSort();
	        
	        ob.bubbleSort(array);
	        System.out.println("Sorted array");
	        ob.printArray(array);
	    }
	}
