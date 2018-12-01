package day01;

import java.util.*;

public class Day01 {

	public static void main(String[] args) {

		int count=0;
		HashSet<Integer> pastFreqs = new HashSet<Integer>();
		boolean isFound = false;
		for(int cycles=0;!isFound;cycles++)
		{
			for(int i=0;i<args.length && !isFound;i++)
			{
				pastFreqs.add(count);
				count+=Integer.parseInt(args[i]);
				if(cycles==1 && i==args.length-1)
					System.out.println("Result 1: " + count);
				if(pastFreqs.contains(count)) {
					System.out.println("Result 2: " + count);
					isFound=true;
				}
				pastFreqs.add(count);
			}
		}
	}

}