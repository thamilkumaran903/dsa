package Arrayplaylist;
import java.util.*;
public class SubsetOfArray {
	public static void main(String srag[])
	{
		Scanner sc = new Scanner(System.in);
		 int arr1[] = {1,2,3,4};
		 int arr2[] = {2,4,5};
		 int arr3[] = {2,1,3};
		 int arr4[] = {1,2};
		 //int g = func(arr1,arr2);
		 int g = func(arr3,arr4); 
		 if(g == -1)
		 {
			 System.out.println("not subset");
		 }
		 else
		 {
			 System.out.println(" subset");
		 }
	}
	public static int func(int arr1[],int arr2[])
	{
		//int flag =1;
		Arrays.sort(arr1);
		int i = 0;
		int j = 0;
		if(arr1.length>arr2.length) 
		{
			while(j<arr2.length && i<arr1.length)
			{
				//flag = 0;
				if(arr1[i] < arr2[j])
				{
					System.out.println("value of arr1 :"+arr1[i]);
					i++;
				}
				else if(arr1[i] == arr2[j])
				{
					
					System.out.println("value of arr1(==) :"+arr1[i]);
					i++;
					j++;
				}
				else
				{
					j++;
				}
			}
			System.out.println("arrrlength1 :"+arr1.length);
			System.out.println("arrlength 2 :"+arr2.length);
			System.out.println("value of i:"+i);
			System.out.println("value of j:"+j);
			if( j == arr2.length)
			{
				System.out.println("value of i:"+i);
				return 1;
			}
			return -1;
		}
		return 0;
	}
}
	/*output:
	  value of arr1(==) :1
value of arr1(==) :2
arrrlength1 :3
arrlength 2 :2
value of i:2
value of j:2
value of i:2
 subset

	 */

