import java.util.Scanner;
class Main{
	public static void main (String[] args){
    	Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int num=1;
		for(int i=1;i<=n;i++)
		{
			for(int j=n;j>i;j--)
			{
				System.out.print(" "); 
			}
			for(int k=1;k<=i;k++)
			{
				System.out.print(num+" ");
				num = num+1;
			}
			System.out.println();
		}		
    }    
}