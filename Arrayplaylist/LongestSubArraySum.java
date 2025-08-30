package Arrayplaylist;
import java.util.*;
public class LongestSubArraySum {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		//int arr[] = new int[20];
		//int n;
		//System.out.println("enter the size of the array :");
		//int n = sc.nextInt();
		//for(int i=1;i<=n;i++)
		//{
			//int z = sc.nextInt();
			//arr[i] = z;
		//}
		/*System.out.println("enter the sum elment:");
		int sum = sc.nextInt();
		int prevcount = 0;
		int count =0;
		int addingvalue = 0;
		int i = 0;
		int j = 0;
		while(i<=n)
		{
			if( addingvalue == sum ||i == j)
			{
				count =0;
			}
		}*/
		System.out.println("enter the sum elment:");
		int sum = sc.nextInt();
		int adding = 0;
		int count = 0;
		int prevcount = 0;
		//int arr[] = {10,5,2,7,1,-10};
		//int arr[] = {3,-1,-1,3,-1,3,2};
		int arr[] = {1,2,1,1,1,1,2};
		for(int i = 0;i<arr.length;i++)
		{
			adding = 0;
			for(int j = i;j<arr.length;j++)
			{
				adding +=arr[j];
				if(adding == sum)
				{
					prevcount = (j-i)+1;
				}
				
				if(prevcount <count)
				{
					prevcount = count;
				}
			}
			if(prevcount == arr.length)
			{
			     break;
			}
			System.out.println("count :"+prevcount);
		}
		//input : 1 1 1 2 3
		// output : longest subarray is : 3(1,1,1);
		System.out.println("length of longest subarry is :"+prevcount);
	}

}
