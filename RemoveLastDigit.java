import java.util.Scanner;

public class RemoveLastDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to remove it's last digit");
        int number = sc.nextInt();
        int lastDigit = number/10;
        System.out.println("The number after removing last digit is: " + lastDigit);
    }
}
