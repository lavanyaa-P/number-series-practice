import java.util.*;

public class ProductOfAllDigits {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the digit: ");
        int n = sc.nextInt();
        int product = 1;
        while(n>0){
            int rem = n%10;
            product=product*rem;
            n=n/10;
        }
        System.out.print("The value is: "+product);
    }
}
