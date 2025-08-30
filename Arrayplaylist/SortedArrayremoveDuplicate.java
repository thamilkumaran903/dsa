package Arrayplaylist;
import java.util.*;
public class SortedArrayremoveDuplicate {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	//int arr[] = {0,0,1,1,1,2,2,3,3,4};
	int arr[] = {1,1,2};
	removeDuplicate(arr);
}
public static void removeDuplicate(int arr[])
{
	Arrays.sort(arr);
	int count = 0;
	int index = 0;
	arr[count] = arr[0];
	for(int i=1;i<arr.length;i++)
	{
		System.out.println("count value = "+count);
		if(arr[count] != arr[i])
		{
			count++;
			arr[count] = arr[i];
		}
	}
	System.out.println("count value(outside) = "+count);
	for(int i=0;i<=count;i++)
	{
		System.out.print(arr[i]+" ");
	}
}
}
/*
 * input and output:
 * count value = 0
count value = 0
count value(outside) = 1
1 2 */
