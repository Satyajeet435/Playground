import java.util.Scanner;
class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
      int mark = sc.nextInt();
      if(mark>=85)
      		{ 
        System.out.println("A");
      }
      else if(mark>=75 && mark<85)
              { System.out.println("B");}
           else if(mark>=65 && mark<75)
                   { System.out.println("C");}
           else if(mark>=55 && mark<65)
                   { System.out.println("D");}
           else if(mark>=45 && mark<55)
                   { System.out.println("E");}
           else{  System.out.println("Fail");}
                   }
                   }
 
