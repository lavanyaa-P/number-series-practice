import java.util.*;

public class FetchLastDigit{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to fetch it's last digit");
        int number = sc.nextInt();
        int lastDigit = number%10;
        System.out.println("The last digit is: " + lastDigit);
    }
}