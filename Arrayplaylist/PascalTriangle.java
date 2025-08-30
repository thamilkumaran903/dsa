package Arrayplaylist;
import java.util.*;
public class PascalTriangle {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("enter the Row :");
	int n = sc.nextInt();
	func(n);
}
public static void func(int row)
{
	//int arr[] = new int[row];
	List<List<Integer>> lst = new ArrayList<>();
	//List<Integer> ans = new ArrayList<>();
	//List<Integer> ans = new ArrayList<>();
	for(int i = 0;i<row;i++)
	{
		System.out.println("yes");
		List<Integer> temp = new ArrayList<>();
		for(int j = 0 ; j <= i ; j++)
		{
			System.out.println("no");
			if(j == 0 || j == i)
			{
				temp.add(1);
			}
			else
			{
				System.out.println("hai i value i and j :"+i+" "+j);
				int number = (lst.get(i-1).get(j-1))+ (lst.get(i-1).get(j));
				System.out.println("number :"+number);
				temp.add(number);
			}
		}
		lst.add(temp);
		//temp.clear();
        //lst.clear();
	}
	for(List<Integer> list : lst)
	{
		System.out.println(list);
		
	}
}
}
