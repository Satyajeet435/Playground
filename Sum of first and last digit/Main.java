import java.util.Scanner;
class Main {
	public static void main (String[] args){
      int sum=0;
	   Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int b = n%10;
      while(n >=10 )
      {
        n=n/10;
      }
      int a= n;
      sum = a+b;
      System.out.println(sum);
	}
}