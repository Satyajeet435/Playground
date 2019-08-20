import java.util.Scanner;
class Main {
	public static void main (String[] args) {
	   Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
      if(n>=1 && n<=5)
      {
      switch(n)
      {
        case 1 : System.out.println("One");
          break;
          case 2 : System.out.println("Two");
          break;
          case 3 : System.out.println("Three");
          break;
          case 4 : System.out.println("4");
          break;
          case 5 : System.out.println("5");
          break;
        default : System.out.println("Invalid");
      }
      }
      else 
         System.out.println("Invalid");
         
         
	}
}