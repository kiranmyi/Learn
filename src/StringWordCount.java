
public class StringWordCount {

	public static void main(String[] args) {
		String s="i love java and i love manual i love automation and i love money";
		String[] str = s.split(" ");
		int count=0;
		for(int i=0;i<str.length;i++)
		{
			if(str[i].equals("love"))
			{
				count++;
			}
		}
		System.out.println("Love is printed "+count+" times in the sentence");

	}

}
