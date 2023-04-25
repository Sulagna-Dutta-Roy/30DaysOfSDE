import java.util.Scanner;


public class threeNumbers {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int num1,num2,num3;
        System.out.println("Enter the first num");
        num1 = sc.nextInt();
        
        System.out.println("Enter the 2nd num");
        num2 = sc.nextInt();
        System.out.println("Enter the 3rd num");
        num1 = sc.nextInt();
        
	}


public static int largest(int num1,int num2,int num3) {
	int max = num1;
	if(num2 > max) {
		num1 = num2;
	}
	if(num3>max) {
		num2=num3;
	}
   return max;
  }

public static int smallest(int num1,int num2,int num3) {
	int min = num1;
	if(num2 < min) {
		num1 = num2;
	}
	if(num3<min) {
		num2=num3;
	}
   return min;
  }
}
