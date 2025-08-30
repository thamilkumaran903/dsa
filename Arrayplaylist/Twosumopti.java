package Arrayplaylist;

import java.util.*;

public class Twosumopti {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		//int n;
		System.out.println("enter the size of the array :");
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i=0;i<n;i++)
		{
			int z = sc.nextInt();
			arr[i] = z;
		}
		System.out.println("enter the sum element :");
		int k = sc.nextInt();
		Arrays.sort(arr);//using the inbuild Arrays object we call the sort method.
		System.out.println("sorted array is ");
		for(int num : arr)//important.
		{
			System.out.print(+num+" ");
		}
		
/*I/p And O/p
* enter the size of the array :
5
1 2 3 4 5
enter the sum element :
7
sorted array is 
1 2 3 4 5 sum value is existing (yes) 

		 */
		int i = 0;
		int j = n-1;
		int flag = 0;
		while (i<n && j>=0)
		{
			if(i == j)
			{
				break;
			}
			else if(arr[i]+arr[j]>k)
			{
				j--;
			}
			else if(arr[i]+arr[j]<k)
			{
				i++;
			}
			else
			{
				flag = 1;
				break;
			}
		}
		if(flag == 1)
		{
			System.out.println("sum value is existing (yes) ");
		}
		else 
		{
			System.out.println("sum value is not existing (no) ");
		}
	}

}
