package Arrayplaylist;
import java.util.*;
public class CheckTheArrayIsSortedOrNot {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("the array element are :");
	//int arr[] = {1,2,2,3,3,4};
	int arr[] = {1,2,2,3,3,4,3};
	if(func(arr))
	{
		System.out.println("array is sorted .");
	}
	else
	{
		System.out.println("array is not sorted .");
	}
}
public static boolean func(int arr[])
{
	for(int i =0;i<arr.length-1;i++)
	{
		if(arr[i]>arr[i+1])
		{
			return false;
		}
	}
	return true;
}
}
