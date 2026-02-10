import java.util.Scanner;

public class task3 {
    private long balance;

    public long Balance(long a){
        return a;
    }

    public long Amount(long amount){

        this.balance = balance;
        if (amount > 1000){
            System.out.println("You have successfully deposited Tsh" + amount + "/=");
        }else
            System.out.println("Enter valid amount from Tsh 1000/=");
        return 0;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the deposit amount: ");

        long a = sc.nextLong();
        task3 Balance = new task3();

        long finalAmount = Balance.Amount(a);
        System.out.println("Your final amount is : " + finalAmount + "/=");

    }


}
