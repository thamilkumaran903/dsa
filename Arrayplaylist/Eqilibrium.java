package Arrayplaylist;
import java.util.*;
public class Eqilibrium {
public static void main(String[] args) {
	int arr[] = {-7,1,5,2,-4,3,0};
	int arr2[] = {1,-1,0};
	int arr3[] = {1,2,3};
	func(arr);
	
	func(arr2);
	
	func(arr3);
}
public static void func(int arr[])
{
	int prefixsum[] = new int[arr.length];
	prefixsum[0] = arr[0];
	for(int i = 1;i<arr.length;i++)
	{
		prefixsum[i] = prefixsum[i-1]+arr[i];
	}
	System.out.println("prefix sum :");
	for(int i = 0;i<prefixsum.length;i++)
	{
		System.out.print(prefixsum[i]+" ");
	}
	System.out.println();
	
	int flag = 0;
	for(int i = 0;i<prefixsum.length;i++)
	{
		 int leftsum = (i == 0) ? 0 : prefixsum[i-1];  
			//int leftsum = prefixsum[i-1];
			int rightsum = prefixsum[(prefixsum.length)-1] - prefixsum[i];
			
			if(leftsum == rightsum)
			{
				flag = 1;
				System.out.println("equilibrium at indx :"+ i);
				break;
			}
	}
	if(flag == 0)
	{
		System.out.println("no equilibrium found"+(-1));
	}
}
}
