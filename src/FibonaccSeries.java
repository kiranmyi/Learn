
public class FibonaccSeries {

	public static void main(String[] args) {
		int num=5;
		int n=0;
		int n1=1;
		int sum=0;
		System.out.print(n+" ");
        System.out.print(n1+" ");
		for(int i=0;i<=num;i++)
		{
		    sum=n+n1;
		    n=n1;
		    n1=sum;
		  System.out.print(sum+" ");  
		}

	}

}
