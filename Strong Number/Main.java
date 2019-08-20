import java.util.Scanner;
class Main {
	public static void main (String[] args){
      int sum=0,fact=1;
	   Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
     int temp= n;
      for(;n!=0;n=n/10)
      {
         int a= n%10;
        fact = 1;
        for(int i=1;i<=a;i++)
        {
          fact = fact*i;
        }
          sum = sum+fact;
        }
        if(temp==sum){
        System.out.println("Yes");
        }else{
        System.out.println("No");
        }
	}
}