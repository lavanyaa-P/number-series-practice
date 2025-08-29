import java.util.*;

public class SumOfDigitExceptFirstAndLast {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the digit: ");
        int n = sc.nextInt();
        n = n / 10;
        int sum = 0;
        while(n>9){
            int rem = n%10;
            sum = sum+rem;
            n = n / 10;
        }
        System.out.print("The sum is: "+sum);
    }
}
