package Arrayplaylist;
import java.util.*;
public class ArrayManipulation {
public static void main(String[] args) {
	List<List<Integer>> result = new ArrayList<>();
	result.add(Arrays.asList(1,3,5));
	result.add(Arrays.asList(0,1,2));
	result.add(Arrays.asList(2,4,3));
	func(new int[6],result,5);
	myAppro(new int[5],result);
}
public static void func(int arrzero[],List<List<Integer>> order,int n)
{
//Optimal Approach	
	int length = -99;
	for(List<Integer> element : order)
	{
		int start = element.get(0);
		int end = element.get(1);
		int value = element.get(2);
		
		arrzero[start] +=value;
		arrzero[end+1] -= value;
		if(length < end)
		{
			length = end;
		}
	}
	System.out.println("length :"+length);
	int max = -1;int sum = 0;
	for(int i = 0;i<n;i++)
	{
		sum +=arrzero[i];
		if(max < sum)
		{
			max = sum;
		}
	}
	
	System.out.println("answer :"+max);
	//TC :O(m+n);
}

public static void myAppro(int arr[],List<List<Integer>> order)
{
	for(List<Integer> element : order)
	{
		int start = element.get(0);
		int end = element.get(1);
		int value = element.get(2);
		
		for(int i = start;i<=end;i++)
		{
			arr[i] += value;
		}
		//TC :O(m*n);
	}
	
	int max = 0;
	for(int i= 0;i<arr.length;i++)
	{
		if(max  < arr[i])
		{
			max = arr[i];
		}
	}
	
	System.out.println("the maximum :"+max);
}
}
