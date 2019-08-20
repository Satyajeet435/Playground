import java.util.Scanner;
class Main {
	public static void main (String[] args){
      int count=1;
	   Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      for(int i=1;i<=100;i++)
      {
        if(count<=n)
        {
        if(i%2==1)
        {
         System.out.println(i); 
         count++; 
      	}
        }
      
      }
      
	}
}