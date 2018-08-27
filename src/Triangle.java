
public class Triangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		int n=5;
		int st=1;
		int sp=(2*n)/2-1;
		int num=1;
      for(int i=1;i<n;i++)
      {
    	  for(int j=1;j<=sp;j++)
    	  {
    		  System.out.print(" ");
    	  }
    	  for(int k=1;k<=st;k++)
    	  {
    		  if((i+k)%2==0)
    		  {
    		  System.out.print(num++);
    		  }
    		  else
    		  {
    			  System.out.print("*");
    		  }
    	  }
    	  System.out.println(); 
    	  st=st+2;
          sp=sp-1;
      }
     
     
	}

}
