import java.util.Scanner;
class Main
{
  void sqr(int n)
  {
  	System.out.println(n*n);
  }
	public static void main (String[] args)
    {
      Main obj = new Main();
	  Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
       obj.sqr(n);
	} 
}