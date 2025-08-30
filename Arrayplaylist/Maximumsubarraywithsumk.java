package Arrayplaylist;

import java.util.Scanner;

public class Maximumsubarraywithsumk {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[20];
		//int n;
		int firstindexsub = 0;
		int lastindexsub = 0;
		System.out.println("enter the size of the array :");
		int n = sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			int z = sc.nextInt();
			arr[i] = z;
		}
		int sum = 0;
		int prev = 0;
		for(int i=1;i<=n;i++)
		{
			for(int j = i;j<=n;j++)
			{
				sum = sum+ arr[j];
				if(prev<sum)
				{
					firstindexsub = i;
					lastindexsub = j;
					prev = sum;
					//System.out.println("maximum sub array sum is :"+prev);
				}
			}
			sum =0;
			
		}
		System.out.println("maximum sub array sum is :"+prev);
		System.out.print("maximum sub array are :");
		for(int i = firstindexsub;i<=lastindexsub;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}

}
