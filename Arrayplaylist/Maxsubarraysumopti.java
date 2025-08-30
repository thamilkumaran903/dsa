package Arrayplaylist;

import java.util.Scanner;
//kadane algn for finding the maximum sub array.
public class Maxsubarraysumopti {
	public static void main(String args[])
	{
		/*Scanner sc = new Scanner(System.in);
		int arr[] = new int[20];
		//int n;
		System.out.println("enter the size of the array :");
		int n = sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			int z = sc.nextInt();
			arr[i] = z;
		}*/
		int arr[] = {1,2,3,4,5};
		int arr2[] = {-2,-3,4,-1,-2,1,5,-3};
		func(arr);
		System.out.println();
		func(arr2);
	}
	public static void func(int arr[])
	{
		int n = arr.length;
		int max = Integer.MIN_VALUE;
		int sum = 0;
		int i  = 0;
		while(i<n) {
			sum = sum + arr[i];
			if(sum <0)
			{
				sum = 0;
				//i++;
			}
			else
			{
				if(sum>max)
				{
					max = sum;
				}
				//i++;
			}
			i++;
		}
		System.out.println("Maximum sub array value is :"+max);
	}
}
