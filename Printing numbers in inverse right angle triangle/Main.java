import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    	    Scanner in = new Scanner(System.in);
		    int n = in.nextInt();		  
			for(int i=n;i>=1;i--)
	    {
	        for (int j=i;j>0;j--)
	        System.out.print(j);
	        System.out.println();
	    }
    		
	}
}