package Arrayplaylist;

import java.util.*;

public class Twosum {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[20];
		//int n;
		System.out.println("enter the size of the array :");
		int n = sc.nextInt();
		for(int i=0;i<n;i++)
		{
			int z = sc.nextInt();
			arr[i] = z;
		}
		System.out.println("enter the sum element :");
		int k = sc.nextInt();
		for(int i = 0;i<n;i++)
		{
			for(int j = i+1;j<n;j++)
			{
				if(arr[i]+arr[j] == k)
				{
					System.out.println("sum index of i and j is : "+i +"\t"+j);
				}
			}
		}
	}

}
