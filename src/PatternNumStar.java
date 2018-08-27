
public class PatternNumStar {

	public static void main(String[] args) {
	 for(int i=1;i<6;i++)
	 {
		 int n=1;
		 for(int j=1;j<6;j++)
		 {
			 if(i>=j)
			 {
				 System.out.print(n++);
			 }
			 else
			 {
				 System.out.print("*");
			 }
		 }
		 System.out.println();
	 }

	}

}
