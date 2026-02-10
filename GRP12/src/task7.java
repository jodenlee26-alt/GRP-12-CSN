import java.util.Scanner;

public class task7 {

    public static int factorial(int x){
        if (x == 0){
            return 1;
        }else {
            return x * factorial(x - 1);
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number; ");

        int number = sc.nextInt();
        System.out.println("The factorial of " + number + " is: " + factorial(number));
    }
}
