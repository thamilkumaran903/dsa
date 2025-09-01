package twopointer;
import java.util.*;
public class Removedupilcatefromsortedarray2 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("array element are ");
	//int arr[] = {1,1,1,2,2,3};
	int arr[] = {0,0,1,1,1,1,2,3,3};

	func(arr);
}
public static void func(int arr[])
{
	int countie = 1;
	int index = 0;
	//int index = arr[0];
	arr[index] = arr[0];
	for(int i=1;i<arr.length;i++)
	{
		if(arr[index] == arr[i] && countie < 2)
		{
			System.out.println("countie value is :"+countie);
			countie++;
			index++;
			arr[index] = arr[i];
		}
		else if(arr[index] != arr[i])
		{
			countie = 1;
			index++;
			arr[index] = arr[i];
		}
	}
	System.out.println("output:");
	for(int i=0;i<=index;i++)
	{
		System.out.print(arr[i]+" ");
	}
}
}
