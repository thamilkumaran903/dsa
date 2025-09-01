package twopointer;
import java.util.*;
public class IdentifyDuplicatenumber {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int arr[] = {0,2,1,2,3};
	int arr3[] = {1,2,3,4,6,5,6};
	inBrute(arr3);//output:6
	int arr2[] = {1,2,5,3,4,5,6};
	inbetter(arr2);//output : 5.
	
	int arr4[] = {1,2,3,4,6,5,6,9};
	int answer = Opti(arr4);
	
	
	if(answer !=-1)
	{
		System.out.println("Optimal answer :"+answer);
	}
	else
	{
		System.out.println("No duplicate element is exists :"+answer);
	}
}
//Brute force approach.
public static void inBrute(int arr[])
{
	Arrays.sort(arr);
	//int j = 0;
	for(int i=0;i<arr.length;i++)
	{
	   int j = i+1;
		if( j<arr.length && arr[i] == arr[j])
		{
			System.out.println("Identified Duplicate :"+arr[i]);
			break;
		}
	}
}
public static void inbetter(int arr[])
{
	Map<Integer,Integer>maps = new TreeMap<>();
	for(int i =0;i<arr.length;i++)
	{
		maps.put(arr[i],maps.getOrDefault(arr[i],0)+1);
	}
	int flag = 0;
	for(int ans : maps.keySet())
	{
		if(maps.get(ans) > 1)
		{
			System.out.println("output answer is :"+ans);
			flag = 0;
			break;
		}
		else
		{
			flag = 1;
		}
	}
	if(flag == 1)
	{
		System.out.println("there is no duplicate elemnt");
	}
}
//using linked cycle
public static int Opti(int arr[])
{
	for(int x : arr)
	{
		System.out.println("x :"+x);
		if(x<1 || x>arr.length-1)
		{
			return -1;
		}
	}
	int count = 0;
	int slow = 0;
	int fast = 0;
	do {
		count = count+1;
		slow = arr[slow];
		fast = arr[arr[fast]];
		System.out.println("slow :"+slow);
		System.out.println("fast :"+fast);
	}while(slow != fast && count<arr.length);
	if(count == arr.length)
	{
		return -1;
	}
	slow = 0;
	while(slow != fast)
	{
		slow = arr[slow];
		fast = arr[fast];
	}
	return slow;
}
}
