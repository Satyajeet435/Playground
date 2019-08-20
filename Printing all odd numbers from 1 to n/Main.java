import java.util.Scanner;
class Main {
	public static void main (String[] args){
      int sum=0;
	   Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      for(int i=1;i<=n;i++)
      {
        if(i%2==1)
         System.out.println(i); 
      }
      
	}
}