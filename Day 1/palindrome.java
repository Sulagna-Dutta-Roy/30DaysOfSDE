import java.util.Scanner;


public class palindrome{
		static int reverse(int n)
	    {
	        int reverse = 0;
	        while (n > 0) {
	            reverse = reverse * 10 + n % 10;
	            n = n / 10;
	       }
	        return reverse;
	}
  public static void main(String[] args) {
	  int n;
	  Scanner sc = new Scanner(System.in);
	  System.out.println("Enter the number");
	  n = sc.nextInt();
      int reverseN = reverse(n);
      System.out.println("Reverse of n = " + reverseN);
     
      if (n == reverseN)
          System.out.println("Palindrome = Yes");
      else
          System.out.println("Palindrome = No");
      } 
	}