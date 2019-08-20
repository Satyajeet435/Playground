import java.util.Scanner;
class Main {
	public static void main (String[] args){
      int arm=1;
	   Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      for(int i=1;i<=n;i++)
      {
      arm = arm*i;
      }
        System.out.println(arm);
	}
}