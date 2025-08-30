//brute force approach for rearrange the array by sign
package Arrayplaylist;

import java.util.Scanner;

public class Reaarangeelementbysign {
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
		int posarr[] = new int[n/2];
		int negarr[] = new int[n/2];
		int z =0;
		int k = 0;
	 //seperatelty collected the negative and positive element.
		for(int i = 0;i<n;i++)
		{
			if(arr[i]<0)
			{
				//int z =0;
				negarr[z] = arr[i];
				z++;
			}
			else
			{
				posarr[k] = arr[i];
				k++;
			}
		}
		System.out.println("value of z is :"+z);
		System.out.println("value of the k is :"+k);
		System.out.print("positve element in the array is :");
		for(int i = 0;i<n/2;i++)
		{
			System.out.print(+posarr[i]+" ");
		}
		System.out.println();
		System.out.print("negative element in the array is :");
		for(int i = 0;i<k;i++)
		{
			System.out.print(+negarr[i]+" ");
		}
		k =0;
		z = 0;
		System.out.println();
	// rearranging process is done there.
		for(int i = 0;i < n/2;i++)
		{
			/*if(i%2 == 0)
			{
				arr[i] = posarr[k++];
				//arr[i] = negarr[z++];
			}
			else
			{
				arr[i] = negarr[z++];
				//arr[i] = posarr[k++];
			}//this also uesd.
			*/
			arr[2*i] = posarr[k++];
			arr[(2*i)+1] = negarr[z++];
		}
		System.out.print("rearranged array by sign is");
		for(int i = 0;i<n;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}

}
