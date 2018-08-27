
public class IncludeSpecialCharacter {

	public static void main(String[] args) {
		String s="rakeshfg";
		char[] c = s.toCharArray();
		for(int i=0;i<c.length;i++)
		{
			if(c[i]=='e')
			{
				c[i]='#';
			}
			else if (c[i]=='f')
			{
				c[i]='*';
			}
			else if(c[i]=='g')
			{
				c[i]='&';
			}
		}
		for(int i=0;i<c.length;i++)
		{
		System.out.print(c[i]);
		}

	}

}
