import java.util.*;

public class GetTheFirstDigit {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the digit");
        int n = sc.nextInt();
        while(n>9){
            n = n/10;
        }
        System.out.println("The first digit is: "+n);
    }
}
