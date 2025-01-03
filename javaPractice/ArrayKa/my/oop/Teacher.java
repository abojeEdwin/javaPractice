package my.oop;

public class Teacher extends Human{

    private String teacherID;
    private int salary;

    public String getTeacherID() {
        return teacherID;
    }

    public void setTeacherID(String teacherID) {
        this.teacherID = teacherID;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int annualSalary(){
        return salary * 12;
    }
    public void write(){
        System.out.println("I am setting the paper");


    }
}
