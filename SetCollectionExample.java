/*
sortedset not allow

*/

import java.util.*;
import java.util.LinkedHashSet;
import java.util.HashSet;
import java.util.SortedSet;

class SetCollectionExample
{
	public static void main(String args[])
	{
		System.out.println("linkedhashset elements");
		LinkedHashSet<Integer> setobj=new LinkedHashSet<Integer>();
			setobj.add(1);
			setobj.add(2);
			setobj.add(3);
			setobj.add(4);
			setobj.remove(3);
		System.out.println(setobj);
		
		System.out.println("hashset elements");
		HashSet<String> hashobj=new HashSet<String>();
			hashobj.add("appa");
			hashobj.add("amma");
			hashobj.add("son");
			hashobj.add("daughter");
		System.out.println(hashobj);
		
		TreeSet<Integer> ssobj=new TreeSet<Integer>();
		ssobj.add(1);
		ssobj.add(2);
		ssobj.add(4);
		System.out.println(ssobj);
		ssobj.remove(2);
		System.out.println(ssobj);
	}

}

