import java.util.Scanner;


public class largestnum {
  public static void main(String[] argv) {
	  int num1,num2,largest;
	  
	  Scanner sc = new Scanner(System.in);
	  System.out.println("Enter the numbers");
	  num1 = sc.nextInt();
	  num2 = sc.nextInt();
	  
	  largest = (num1>num2) ? num1 : num2;
      System.out.println("\nLargest = " +largest);
  }
}
