import java.util.Scanner;

public class CountTheDigit{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the digits");
        int input = sc.nextInt();
        int count = 0;
        while(input>0){
            count++;
            input = input/10;
        }
        System.out.println("The count is: "+count);
    }
}