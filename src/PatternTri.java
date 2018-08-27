
public class PatternTri {

	public static void main(String[] args) {
		int n=9;
		int st=1;
		int sp=n/2;
		for(int i=1;i<=n;i++)
		{
			for(int k=1;k<=st;k++)
			{
				System.out.print("*");
			}
			System.out.println();
			if(i<=n/2)
			{
				st=st+1;
			}
			else
				st=st-1;
		}
		

	}

}
