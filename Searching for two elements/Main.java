import java.util.Scanner;
class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
      int y=0;
      int size = sc.nextInt();
      int a[]=new int[size];
      for(int n=0;n<size;n++)
      {
      a[n]=sc.nextInt();
      }
      int n1 = sc.nextInt();
      int n2 = sc.nextInt();
    
     int x = arr(a,size,n1);
       y = arr(a,size,n2);
      System.out.println(x);
      System.out.println(y);
    }
  public static int arr(int [] a,int size,int n)
  { int x=0;
  	for(int i=0;i<=size;i++)
    {
      if(n>=100)
  		{
  			x=-1;
  		}
  		else if(n==a[i])
      {
      	x=i;
        break;
      }

      }
  return x;
  }
}