import java.util.*;

public class SumOfFirstAndLastDigit {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the digit: ");
        int n = sc.nextInt();
        int lastDigit = n%10;
        int sum = 0;
        while(n>9){
            n = n / 10;
        }
        sum = lastDigit+n;
        System.out.println("Hence the sum of first and the last digit is: "+sum);
    }
}
