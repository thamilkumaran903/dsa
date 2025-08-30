package Arrayplaylist;
//Kadane Algn
import java.util.*;
// NOT APPLICABLE FOR NEGATIVE VALUE IN THE ARRAY.
public class LongestsubArrayopti {
	public static void main(String args[])
	{
		/*Scanner sc = new Scanner(System.in);
		int arr[] = new int[20];
		//int n;
		System.out.println("enter the size of the array :");
		int n = sc.nextInt();
		for(int i=0;i<n;i++)
		{
			int z = sc.nextInt();
			arr[i] = z;
		}
		int sum = 0;
		int leng = 0;
		int maxlen = 0;
		System.out.println("enter the sum value  :");
		int k = sc.nextInt();
		int i= 0;
		int j = 0;
		int z = 0;
		//sum = sum + arr[j];
		while (i < n  && j<n)
		{
			if(sum<=k)
			{
			if(sum == k)
			{
				maxlen = leng;
		        leng = j-i;
		        if(maxlen<leng)
		        {
		        	maxlen = leng;
		        }
		        
			}
			sum = sum + arr[j];
			j++;
			}
			else if (sum>k)
			{
				sum = sum - arr[i];
				i++;
			}
			//z++;
		
		}
		System.out.println("longest sub array is :"+maxlen);	
		}
*/
		int arr[] = {-2,1,-3,4,-1,2,1,-5,4};
		kadaneAlgn(arr);
		int arr2[] = {2, 3, -8, 7, -1, 2, 3};
		kadaneAlgn(arr2);
		int arr3[]= {5, 4, 1, 7, 8};
		kadaneAlgn(arr3);
		
		int arr4[]= {0, -3, 5, -2, 0, 4, -1, 2};
		kadaneAlgn(arr4);
		
}
	public static void kadaneAlgn(int arr[])
	{
		int maxhere = arr[0];
		int maxsofor = arr[0];
		int nums = arr[0];
		int tempstart = 0;
		int start = 0;
		int end = 0;
		for(int i = 1;i<arr.length;i++)
		{
			nums =arr[i];
			if(nums>(maxhere+nums))
			{
				//System.out.println("yes");
				maxhere = nums;
				tempstart = i;
				//System.out.println("tempstart :"+tempstart);
			}
			else
			{
				//System.out.println("no");
				maxhere +=nums ;
			}
			//System.out.println("maxherre :"+maxhere);
			if(maxhere>maxsofor)
			{
				maxsofor = maxhere;
				start = tempstart;
				end = i;
				
				//System.out.println("start :"+start);
				//System.out.println("end :"+end);
			}
		}
		
		System.out.println("maximum subarray is ");
		
		for(int i = start;i<=end;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println("\nAnd count :"+maxsofor);
	}
}