// first two function sub sequence of the given array.
package subarray;
import java.util.*;
public class MAximumSubArrayWithEqualToKsum {
public static void main(String[] args) {
	int arr[] = {3,1,2};
	chatAppro(arr);
	String s = "abc";
	ChatApproString(s);
	int arr2[] = {1,2,1,1,1,2};
	int arr3[] = {1,-1,5,-2,3};
	ChatAppro(arr2,4);
	ChatAppro(arr3,3);
	int arr4[] = {1,-1,-1,2,3};
	ChatAppro(arr4,2);
	int arr5[] = {1,1,1};
	ChatAppro(arr5,2);
	int arr6[] = {1,2,1,2,1};
	ChatAppro(arr6,3);
	
	int arr7[] = {0,0,0};
	ChatAppro(arr7,0);
	
	int arr8[] = {3,4,7,2,-3,1,4,2};
	ChatAppro(arr8,7);
}
public static void chatAppro(int arr[])
{
	//Create all SubSet of an given array.(not class name type questions)
	List<List<Integer>> list1 = new ArrayList<>();
	list1.add(new ArrayList<>());
	
	for(int num : arr)
	{
		int currentsize = list1.size();
		for(int i = 0;i<currentsize;i++)
		{
			System.out.println("element in List1 :"+list1.get(i));
			List<Integer> newSub = new ArrayList<>(list1.get(i));
			newSub.add(num);
			list1.add(newSub);
		}
	}
	
	System.out.println("output is :");
	for(List<Integer> l: list1 )
	{
			System.out.println(l);
	}
}

public static void ChatApproString(String s)
{
	//my approach
	String ans[] = new String[30];
	int j = 0;int count = 0;
	ans[j] = "";
	//int j = 1;
	count++;
	for(char c : s.toCharArray())
	{
		int curr = count;
		System.out.println("length:"+curr);
		for(int i = 0;i<curr;i++)
		{
			String x = ans[i];
			String in = x+String.valueOf(c);
			ans[++j] = in;
			count++;
		}
	}
	for(int i = 0;i<count;i++)
	{
		System.out.println(ans[i]);
	}
}

public static void ChatAppro(int arr[],int k)
{
	int sum = 0;int maxlen = 0;int count = 0;int z = 0;
	HashMap<Integer,Integer> maps = new HashMap<>(); 
	for(int i = 0;i<arr.length;i++)
	{
		sum = sum+arr[i];
		if(sum == k)
		{
			count++;
			maxlen = i+1;
		}
		if(maps.containsKey(sum-k))
		{
			System.out.println("yes:"+(sum-k));
			count++;
			maxlen = max(maxlen,i-maps.get(sum-k));
		}
		if(!maps.containsKey(sum))
		{
			maps.put(sum , i);
		}
	}
	
	System.out.println("output :"+maxlen +" possible count :"+(count));
}
public static int max(int a,int b)
{
	return a >= b ?  a: b;
}

}
