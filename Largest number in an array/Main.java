import java.util.Scanner;
class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
      int large =0;
      int size = sc.nextInt();
      int a[]=new int[size];
      for(int n=0;n<size;n++)
      {
      a[n]=sc.nextInt();
      }
      large=a[0];
      for(int i=1;i<size;i++)
      {
       if(a[i]>large)
         large=a[i];
        
      }
      System.out.println(large);
     
      
    
    }
}