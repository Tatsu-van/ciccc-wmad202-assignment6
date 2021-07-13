package ca.ciccc.wmad202.assignment6.example2;

public class Student {
    private String firstName;
    private String lastName;

    public Student(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void printStudentInfo(){
        System.out.println("First Name: " + getFirstName());
        System.out.println("last Name: " + getLastName());
    }

    public String getStudentInfo() {
        String info = "First Name: " + getFirstName() + "\n" + "Last Name: " + getLastName();
        return info;
    }

//    @Override

    public String toString(){
//        return "Ali";/
        String info = "------------------------------------------------------------\n";
        info = info.concat("First Name: " + getFirstName() + "\n" + "Last Name: " + getLastName());
        return info;
    }
}
