package subarray;
import java.util.*;
public class LongUniqueSubArray {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	String s = "abcabcbb";
	String d = "pwwkew";
	String f = "abcdbeghef";
	MyAppro(s);
	MyAppro(d);
	MyAppro(f);
	
	Optimal(f);
	
	Optimal(s);
}
public static void MyAppro(String s)
{
	//told by sabari
	int max = 0;
	Set<Character> sets = new LinkedHashSet<>();
	for(char c : s.toCharArray())
	{
		if(!sets.contains(c))
		{
			sets.add(c);
			System.out.println("set :"+sets);
		}
		else
		{
			List<Character> toRemove = new ArrayList<>();
			boolean found = false;
			for(char d : sets)
			{
				if(d != c)
				{
					toRemove.add(d);
				}
				else
				{
					toRemove.add(d);
					sets.removeAll(toRemove);
					sets.add(c);
					break;
				}
			}
		}
		if(sets.size()>max)
		{
			max = sets.size();
		}
	}
	System.out.println("output :"+sets +"Max size is :"+max);
}

public static void Optimal(String s)
{
	int start = 0;
	int max = 0;
	Map <Character,Integer> maps = new HashMap<>();
	for(int i = 0;i<s.length();i++)
	{
		char c = s.charAt(i);
		if(maps.containsKey(c))
		{
			start = Math.max(start, maps.get(c));
		}
		
		max = Math.max(max, i-start+1);
		maps.put(c,i+1);
	}
	System.out.println("max len is :"+max);
	System.out.println("\nmaps contains :"+maps);
}
}
