package Arrayplaylist;

import java.util.Scanner;

public class Firstuniqueelement {
	public static void main(String args[])
	{
		Scanner sc  = new Scanner(System.in);
		System.out.println("enter the array size :");
		int n = sc.nextInt();
		int arr[] = new int[n];
		System.out.println("enter the array element :");
		for(int i=0;i<arr.length;i++)
		{
			int x = sc.nextInt();
			arr[i] = x;
		}
		int total = 0;
		for(int num : arr)
		{
			total = total^num;
		}
		System.out.println("The Unique Element is :"+total);
	}

}
/*
 
 input 1:
 enter the array size :
5
enter the array element :
1 2 6 2 1
The Unique Element is :6
input 2:
enter the array size :
5
enter the array element :
1 -2 -2 1 3
The Unique Element is :3

 */
