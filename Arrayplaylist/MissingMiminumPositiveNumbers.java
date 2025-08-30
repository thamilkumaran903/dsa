package Arrayplaylist;
import java.util.*;
public class MissingMiminumPositiveNumbers {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	/*int arr[] = {1,-1,4,3};
	int arr2[] = {8,9,10,12,11};
	myAppro(arr);
	myAppro(arr2);
	int arr3[] = {5,1,2,3,4};
	myAppro(arr3);
	
	func(arr);
	func(arr2);
	func(arr3);
	int arr4[] = {5,10,0,1,2};
	func(arr4);
	//optimal
	myAppro(arr4);*/
	int arr5[]= {1,1,2,2,3,3};
//	myAppro(arr5);
	func(arr5);
	
	int arr6[] = {1,2,6,3,5,4};
	myAppro(arr6);
	func(arr6);
}
public static void myAppro(int arr[])
{
	////optimal solution.(using swap)
	//System.out.println("yes");
	int n = arr.length;
	int i = 0;
	while(i<n)
	{
		int value = arr[i];
		//System.out.println("value:"+value);
		if(arr[i] <=0)
		{
			i++;
		}
		else if(value == i+1 || value >= n)
		{
			i++;
		}
		else
		{
			int temp = arr[i];
			 arr[i] = arr[value-1];
			arr[value-1] = temp; 
		}
	}
	
	System.out.print("output :");
	for(int j = 0;j<n;j++)
	{
		System.out.print(+arr[j]+" ");
	}
	System.out.println();
	int missing = 1;int flag = 0;
	for(int k = 0;k<n;k++)
	{
		if(arr[k] == missing)
		{
			missing++;
		}
		else
		{
			flag =1;
			System.out.println("elment missing :"+missing);
			break;
		}
	}
	if(flag == 0)
	{
		System.out.println("elmeent missing :"+missing);
	}
}

public static void func(int arr[])
{
	//my approach(using hashsets.)
	//better solution
	int n = arr.length;
	Set<Integer> sets = new TreeSet<>();
	for(int i = 0;i<n;i++)
	{
		if(arr[i]>0)
		{
			sets.add(arr[i]);
		}
	}
	System.out.println("outtine :"+sets);
	
	int miss = 1;int flag = 0;
	for(int value : sets)
	{
		if(value == miss)
		{
			miss++;
		}
		else
		{
			flag = 1;
			System.out.println("missing element is :"+miss);
			break;
		}
	}
	if(flag == 0)
	{
		System.err.println("missing elments :"+miss);
	}
}
}
