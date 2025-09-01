import java.util.Scanner;

public class GivenNoIsNeonOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the digit: ");
        int n = sc.nextInt();
        int square = n*n;
        int sum = 0;

        while(square>0){
            int rem = square%10;
            sum = sum+rem;
            square = square/10;
        }

        System.out.println(sum);
        if(n==sum){
            System.out.println("It is a neon number");
        }
        else{
            System.out.println("Not a neon number");
        }

    }
}
