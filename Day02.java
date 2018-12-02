package day02;
public class Day02 {

	public static void main(String[] args) {
		int twice=0;
		int triple=0;
		int count=0;
		boolean foundTwice;
		boolean foundTriple;
		String str;
		String comp;
		for(int k=0;k<args.length;k++) {
			str=args[k];
			foundTwice=false;
			foundTriple=false;
			for(char i='a';i<='z';i++)
			{
				for(int j=0;j<26;j++) {
					if(str.charAt(j)==i) count++;
				}
			if(count==2 && foundTwice==false)
			{
				twice++;
				foundTwice=true;
			}
			if(count==3 && foundTriple==false)
			{
				triple++;
				foundTriple=true;
			}
			count=0;
			}
		}
		System.out.println("Part 1 result: "+(twice*triple));
		int rem=0;
		for(int i=0;i<args.length;i++)
		{
			str=args[i];
			for(int j=i;j<args.length;j++)
			{
				count=0;
				comp=args[j];
				for(int k=0;k<26;k++)
				{
					if(str.charAt(k)==comp.charAt(k)) count++;
					else rem=k;
				}
				if(count==25)
				{
					StringBuffer sb = new StringBuffer(comp);
					sb.deleteCharAt(rem);
					System.out.println("Part 2 result: "+sb);
					break;
				}
			}
		}
	}

}
