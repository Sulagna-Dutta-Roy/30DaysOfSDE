import java.util.Scanner;
public class areaofCircle {

	public static void main(String[] args) {
	    int r;
        double pi=3.14,area;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius");
        r = sc.nextInt();
        area = pi*(r*r);
        System.out.println("The area is"+area);
	}

}
