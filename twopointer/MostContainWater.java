package twopointer;
import java.util.*;
public class MostContainWater {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	//int arr[] = {1,8,6,2,5,4,8,3,7};
	//int arr[] = {1,1};
	//int arr[] = {0,0,0,0};
	int arr[] = {2,3,10,5,7,8,9};
	func(arr);
}
public static void func(int arr[])
{
	int left = 0;
	int right = arr.length-1;
	int max = -999;
	int sum = 0;
	int less = 0;
	int high = 0;
	int flag = 0;
	for(int i = 0;i<arr.length;i++)
	{
		if(arr[left]>arr[right])
		{
			sum = (arr[right] * (right-left));
			right--;flag = 1;
		}
		else if(arr[left]<=arr[right])
		{
			sum = (arr[left] * (right-left));
			left++;flag = 2;
		}
		if(sum>max)
		{
			if(flag == 1)
			{
			less = left;
			high = right+1;
			max = sum;
			}
			else if(flag == 2)
			{
				less = left-1;
				high = right;
				max = sum;
			}
		}
		sum = 0;
	}
	System.out.println("output max is : "+max);
	System.out.println("index are less and high are :"+less+" "+high);
}
}
