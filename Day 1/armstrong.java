import java.util.Scanner;


public class armstrong {
   public static void main(String[] args) {
        int number, originalNumber, remainder, result = 0;
        System.out.println("Enter the number");
        Scanner sc = new Scanner(System.in);
        number = sc.nextInt();
        originalNumber = number;
        while (originalNumber != 0)
        {
            remainder = originalNumber % 10;
            result += Math.pow(remainder, 3);
            originalNumber /= 10;
        }
        if(result == number)
            System.out.println(number + " is an Armstrong number.");
        else
            System.out.println(number + " is not an Armstrong number.");
    }
}