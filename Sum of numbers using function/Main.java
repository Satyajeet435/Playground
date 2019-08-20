import java.util.Scanner;
class Main
{
  void sqr(int n)
  { int s = 0;
  	for(int i =1 ; i<=n; i++)
      s=s+i;
   System.out.println(s);
  }
	public static void main (String[] args)
    {
      Main obj = new Main();
	  Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
       obj.sqr(n);
	} 
}