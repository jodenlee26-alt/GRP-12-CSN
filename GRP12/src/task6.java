class task6 {
    String name;
    int marks;

    task6(String name, int marks){
        this.name = name;
        this.marks = marks;
    }

    public static void updateStudent(task6 student){
        student.name = "Ahmada";
        student.marks = 90;
    }

    public static void main(String[] args){
        task6 obj = new task6("John", 50);

        System.out.println("Before Update; " + obj.name + ", " + obj.marks);

        updateStudent(obj);
        System.out.println("After Update; " + obj.name + ", " + obj.marks);
    }

}
