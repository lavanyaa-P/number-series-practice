import java.util.*;

public class NoIsXylemOrPholem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the digit: ");
        int n = sc.nextInt();
        int lastDigit = n%10;
        n = n / 10;
        int sum = 0;
        while(n>9){
            int rem = n%10;
            sum = sum+rem;
            n=n/10;
        }
        int sum2 = lastDigit+n;
        if(sum == sum2){
            System.out.println("Xylem");
        }else{
            System.out.println("Pholem");
        }
    }
}
