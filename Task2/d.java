package Task2;

import java.util.*;

public class d
{
	public static void arrayFunc(int arr[], int n)
	{
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter target number  : ");
		 int target = sc.nextInt();
		 
		 for(int i=0; i<n; i++)
		 {
			 for(int j=i+1; j<n; j++)
			 {
				 if(arr[i]+arr[j]==target)
				 {
					 System.out.println(arr[i]+ " + " + arr[j] + " = " + target);
				 }
			 }
		 }
		 
	}

	public static void arrayFunc(int arr[], int n, int brr[], int length)
	{
		 int size = n + length;
		 
		 int crr[] = new int[size];
		 
		 int i=0, j=0, k=0;
		 
		 while(i<n && j<length)
		 {
			 if(arr[i]<brr[j])
				 crr[k++]=arr[i++];
			 else
				 crr[k++]=brr[j++];
		 }
		 
		 for( ; i<n; i++)
		 {
			 crr[k++]=arr[i];
			 k++;
		 }
		 
		 for( ; j<length; j++)
		 {
			 crr[k++]=brr[j];
		 }
		 
		 Arrays.sort(crr);
		 
		 for(int counter  : crr)
		 {
			 System.out.print(counter + " ");
		 }
	}
	
     public static void main(String[] args)
     {
    	 Scanner input = new Scanner(System.in);
    	 System.out.print("Enter array limit : ");
    	 int n = input.nextInt();
    	 
    	 int arr[] = new int[n];
    	 
    	 System.out.println("Enter array elements in the sorted order : ");
    	 for(int i=0; i<n; i++)
    	 {
    		 int temp = input.nextInt();
    		 arr[i]=temp;
    	 }
    	 
    	 arrayFunc(arr, n);
    	 
    	 int[] brr = {2, 4, 9};
    	 int length = brr.length;
    	 
    	 arrayFunc(arr, n, brr, length);
    	 
     }
     
}