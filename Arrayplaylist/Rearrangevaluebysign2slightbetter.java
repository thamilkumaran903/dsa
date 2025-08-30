package Arrayplaylist;

import java.util.Scanner;

public class Rearrangevaluebysign2slightbetter {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[20];
		//int n;
		System.out.println("enter the size of the array :");
		int n = sc.nextInt();
		for(int i=0;i<n;i++)
		{
			int z = sc.nextInt();
			arr[i] = z;
		}
		//process done there.
		int index = 0;
		int i = 0;
		int j = 1;
		int arr2[] = new int[20];
		while(index<n && i<n+2 && j<n+2)
		{
			if(arr[index] <0)
			{
				arr2[i] = arr[index];
				i = i+2;
			}
			else
			{
				arr2[j] = arr[index];
				j = j+2;
			}
			index++;
		}
		System.out.println("rearranged :");
		i = 0;
		for(i= 0;i<n;i++)
		{
			System.out.print(arr2[i]+" ");
		}
		}
	

}
