import java.util.Scanner;

public class task5 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your marks: ");

        int marks = sc.nextInt();
        System.out.println("Before modify method: " + marks);

        modify(marks);
        System.out.println("After modify method: "+ marks);   // The modified result will not change 
    }

    public static void modify(int marks){
        marks = 30;

        System.out.println("Inside method marks = " + marks);
    }
}
