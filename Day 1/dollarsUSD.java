import java.util.Scanner;

public class dollarsUSD {
	public static void main(String[] argv) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the rupees");
	float rupees;
	rupees = sc.nextLong();
	float dollars = rupees / 64;
	System.out.println("The USD number"+dollars);
	}
}