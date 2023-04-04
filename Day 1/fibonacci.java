import java.util.Scanner;
import java.io.*;

public class fibonacci {
  public static int fibonacciInt(int n) {
	  if(n==0) {
		  return 0;
	  }
	  else if (n==1) {
		  return 1;
	  }
	  else {
		  return fibonacciInt(n-2)+fibonacciInt(n-1);
	  }
  }
  public static void main(String[] argv) {
	  int n;
	  System.out.println("Enter the number");
	  Scanner sc = new Scanner(System.in);
	  n = sc.nextInt();
	  for(int i = 0; i < n; i++){
	     System.out.print(fibonacciInt(i)+ " ");
   }
  }
}