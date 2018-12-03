package day03;
import java.util.*;
import java.io.*;

public class Day03 {

	public static void main(String[] args) throws FileNotFoundException {
	
		Scanner sc = new Scanner(new File("Day03input.txt"));
		
		int[][] tab = new int[1000][1000];
		int[] begx=new int[1399];
		int[] begy=new int[1399];
		int[] xsize=new int[1399];
		int[] ysize=new int[1399];
		int count=0;
		int[] elfNum=new int[1399];
		int noMatch=0;
		String s;
		for(int k=0;k<1399;k++)
		{
			s=sc.nextLine();
			elfNum[k]=Integer.parseInt(s.substring(s.indexOf("#")+1, s.indexOf(" ")));
			begx[k]=Integer.parseInt(s.substring(s.indexOf("@")+2, s.indexOf(",")));
			begy[k]=Integer.parseInt(s.substring(s.indexOf(",")+1, s.indexOf(":")));
			xsize[k]=Integer.parseInt(s.substring(s.indexOf(":")+2, s.indexOf("x")));
			ysize[k]=Integer.parseInt(s.substring(s.indexOf("x")+1));
			for(int i=begx[k];i<(begx[k]+xsize[k]);i++)
			{
				for(int j=begy[k];j<(begy[k]+ysize[k]);j++)
				{
					 tab[i][j]++;
				}
			}
		}
		for(int i=0;i<1000;i++) {
			for(int j=0;j<1000;j++) {
				if(tab[i][j]>1) count++;
			}
		}
		System.out.println("Result 1: "+count);
		for(int k=0;k<1399;k++)
		{
			for(int i=begx[k];i<(begx[k]+xsize[k]);i++)
			{
				for(int j=begy[k];j<(begy[k]+ysize[k]);j++)
				{
					 if(tab[i][j]==1) noMatch++;
				}
			}
			if(noMatch==(xsize[k]*ysize[k])) System.out.println("Result 2: "+elfNum[k]);
			noMatch=0;
		}
		sc.close();
	}
}
