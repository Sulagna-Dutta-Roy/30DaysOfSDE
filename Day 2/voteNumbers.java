import java.util.Scanner;


public class voteNumbers {
   public static void main(String[] args) {
		int age;
        System.out.println("Enter the age");
        Scanner sc = new Scanner(System.in);
        age = sc.nextInt();
	    if(age>=18) {
		  System.out.println("The girl is eligible to vote");
	   }
	   if(age<=18) {
		  System.out.println("The girl is not eligible to vote");
	  }
  }
}