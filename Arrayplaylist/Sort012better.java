package Arrayplaylist;
import java.util.*;
public class Sort012better {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the array size :");
		int n = sc.nextInt();
		int count0 = 0;
		int count1 = 0;
		int count2 = 0;
		int arr[] = new int[n];
		System.out.println("enter the array element are ");
		for(int i = 0;i<n;i++)
		{
			int d = sc.nextInt();
			arr[i] = d;
		}
		//count number of 0's,1's,2's
		for(int i=0;i<n;i++)
		{
			if(arr[i] == 0)
			{
				count0++;
			}
			
			else if(arr[i] == 1)
			{
				count1++;
			}
			else if(arr[i] == 2)
			{
				count2++;
			}
		}
		System.out.println("count of zeros are :"+count0);
		System.out.println("count of ones are :"+count1);
		System.out.println("count of twos are :"+count2);
		count1 = count0+count1;
		count2 = count1+count2;
		for(int i=0;i<count0;i++)
		{
			arr[i] =0;
		}
		for(int i=count0;i<count1;i++)
		{
			arr[i] =1;
		}
		for(int i=count1;i<count2;i++)
		{
			arr[i] =2;
		}
		System.out.println("Sorted array is :");
		for(int i=0;i<n;i++)
		{
			System.out.print(+arr[i]);
		}
	}

}
