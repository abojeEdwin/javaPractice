package my.oop;

public class Student extends Human{

    private int rollNo;
    private int studentMark;

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public int getStudentMark() {
        return studentMark;
    }

    public void setStudentMark(int marks){
        studentMark = marks;
            if(marks >= 0)
                studentMark = marks;
            else
                studentMark = 0;

    }
    public double getPercentage(){
        return (studentMark*1.0/75) * 100;

    }
    public void write(){
        System.out.println("I am writing a paper");
    }
    public void write(String assign){
        System.out.println("I am writing an assignment");
    }

}
