import java.util.Scanner;

class task2 {
    int marks;

    public int student(int marks){
        return marks;
    }

    public char getGrade(double marks){

        if (marks >= 70 && marks <= 100){
            return 'A';
        } else if (marks >= 60 && marks <= 69){
            return 'B';
        } else if (marks >= 50 && marks <= 59) {
            return 'C';
        } else if (marks >= 40 && marks <= 49) {
            return 'D';
        } else if (marks < 40) {
            return 'F';
        } else {
            System.out.println("Marks you entered is Invalid, Enter the valid marks: ");
        }
    return 0;}

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your marks: ");

        int marks = sc.nextInt();

        task2 student = new task2();

        char Grade = student.getGrade(marks);
        System.out.println("You have scored grade; "+ Grade);

    }
}
