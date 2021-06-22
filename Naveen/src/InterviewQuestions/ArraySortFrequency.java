package InterviewQuestions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

//You are given an array of length n. Sort the elements in descending order of their frequency.
public class ArraySortFrequency 
{
	static int a[]= {4,3,1,6,4,3,6,4};
	//Output-{4,4,4,3,3,6,6,1}
	public static void main(String[] args) 
	{
		int len=a.length;
		int out[]=new int[len];
		Map<Integer,Integer> hm=new HashMap<>();
		for(int k=0;k<len;k++)
		{
			if(hm.containsKey(a[k]))
			{
				int count=hm.get(a[k]);
				hm.put(a[k], count+1);
			}
			else
			{
				hm.put(a[k], 1);
			}
		}
		System.out.println(hm);
		
		Set<Map.Entry<Integer,Integer>> e=hm.entrySet();
		ArrayList<Map.Entry<Integer,Integer>> list=new ArrayList<>(e);
		Comparator<Map.Entry<Integer,Integer>> c=(a,b)->{return a.getValue()>b.getValue()?-1:a.getValue()>b.getValue()?1:0;};
		Collections.sort(list,c);
		System.out.println(list);
		int i=0;
		for(Map.Entry<Integer,Integer> e2:list)
		{
			int frequency=e2.getValue();
			while(frequency>0)
			{
				out[i++]=e2.getKey();
				frequency--;
			}
		}
		
		for(int n:out)
		{
			System.out.print(n+" ");
		}
	}
}
