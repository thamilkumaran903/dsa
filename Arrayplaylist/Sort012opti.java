//Detach National flag algorithm 
package Arrayplaylist;

import java.util.Scanner;

public class Sort012opti {
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
		int mid = 0;
		int low = 0;
		int high = n-1;
		while(mid<=high)//important
		{
			if(arr[mid] == 0)
			{
				int temp = arr[mid];
				arr[mid] = arr[low];
				arr[low] = temp;
				mid++;
				low++;
			}
			else if(arr[mid] == 1)
			{
				mid++;
			}
			else 
			{
				int temp = arr[high];
				arr[high] = arr[mid];
				arr[mid] = temp;
				high--;
			}
		}
		System.out.println(" sorted array is :");
		for(int i = 0;i<n;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
	
}
