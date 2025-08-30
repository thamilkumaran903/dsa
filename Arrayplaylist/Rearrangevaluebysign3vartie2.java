package Arrayplaylist;
import java.util.*;
public class Rearrangevaluebysign3vartie2 {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the array size :");
		int n = sc.nextInt();
		int arr[] = new int[20];
		System.out.println("enter the array element :");
		for(int i =0;i<n;i++)
		{
			 int z = sc.nextInt();
		     arr[i] = z;
		}
		System.out.println();
		System.out.print("array element re:");
		for(int i =0;i<n;i++)
		{
			 System.out.print(arr[i]+" ");
		}
		
	}

}
