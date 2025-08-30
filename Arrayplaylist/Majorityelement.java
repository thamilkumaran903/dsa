//optimal approach
//Moans voting algorithm
package Arrayplaylist;
import java.util.Scanner;

public class Majorityelement {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		//int arr[] = new int[20];
		//int n;
		/*System.out.println("enter the size of the array :");
		int n = sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			int z = sc.nextInt();
			arr[i] = z;
		}*/
		/*
		 * test case are :
		 * [3, 3, 4] → 3

[2, 2, 1, 1, 1, 2, 2] → 2

[1] → 1

[5, 5, 2, 2, 2, 5, 5] → 5

[1, 2, 3, 4] → No majority element


		 */
		
		int arr[] = {2,2,1,1,1,2,2};
		func(arr);
	}
	public static void func(int arr[])
	{
		// I ReWatched it .
		int n = arr.length;;
		int i = 1;
		int ele = arr[0];
		int count = 1;
		while (i<n)
		{
			if(arr[i] == ele && count > 0)
			{
				i++;
				count++;
			}
			else if(arr[i] != ele)
			{
				i++;
				count--;
				if(count == 0)
				{
					ele = arr[i];
					i++;
					count = 1;
				}
			}
			
		}
		count = 0;
		for(int j= 0;j<n;j++)
		{
			if(arr[j] == ele)
			{
				count++;
			}
		}
		if(n/2 < count )
		{
			System.out.println("Majority element is : "+ele+"and there count :"+count);
		}
		else
		{
			System.out.println("no majority element ");
		}
	}
}
