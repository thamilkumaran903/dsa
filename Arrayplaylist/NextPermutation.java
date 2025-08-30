package Arrayplaylist;
import java.util.*;
public class NextPermutation {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int arr[] = {1,3,5,4,2};
	int arr2[] = {1,2,3};
	int arr3[] = {1,5,4};
	int arr4[] = {1,1,5};
	MyAppro(arr);
	MyAppro(arr2);
	MyAppro(arr3);
	MyAppro(arr4);
}

public static void MyAppro(int arr[])
{
	int index = 0;
	int pivot = 0;
	int n = arr.length;
	for(int i = n-1;i>=0;i--)
	{
		if(arr[i-1]<arr[i])
		{
			index = i;
			pivot = arr[i-1];
			
			break;
		}
	}
	System.out.println("pivot :"+pivot);
	int suss = 0;int susin = 0;
	for(int i = n-1;i>=index;i--)
	{
		if(arr[i]>pivot)
		{
			suss = arr[i];
			susin = i;
			break;
		}
	}
	System.out.println("suss :"+suss);
	int temp = arr[index-1];
	arr[index-1] = arr[susin];
	arr[susin] = temp;
	int low = index;
	int high = n-1;
	while(low<high)
	{
		int temp1 = arr[low];
		arr[low] = arr[high];
		arr[high] = temp1;
		low++;
		high--;
	}
	
	System.out.println("output  :");
	for(int i = 0;i<n;i++)
	{
		System.out.print(arr[i]+" ");
	}
	System.out.println();
}
}
