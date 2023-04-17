import java.util.Scanner;

public class areaofTriangle {
	public static void main(String[] args) {
		int b;
		int h;
		int area;
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter the base");
        b = sc.nextInt();
        System.out.println("Enter the height");
        h = sc.nextInt();
        area = (b*h)/2;
        System.out.println("The area is"+area);
	}
}