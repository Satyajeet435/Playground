import java.util.Scanner;
class Main {
	public static void main (String[] args){
      int arm=0;
	   Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
     int temp= n;
      for(;n!=0;n/=10)
      {
         int a= n%10;
        arm=arm+(a*a*a);
      }
      if(arm==temp)
        System.out.println("Armstrong Number");
      else
        System.out.println("Not a Armstrong Number");
	}
}