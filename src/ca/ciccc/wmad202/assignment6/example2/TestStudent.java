package ca.ciccc.wmad202.assignment6.example2;

public class TestStudent {
    public static void main(String[] args){
        Student st1 = new Student("Ali", "Dave");
        Student st2 = new Student("Jack", "Peter");



        st1.printStudentInfo();
        st2.printStudentInfo();

        System.out.println(st1);
    }
}
