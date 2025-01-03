package my.oop;

public class School{

    public static void main(String[] args) {

        Student obj = new Student();
        obj.setRollNo(4);
        obj.setAge(21);
        obj.setStudentMark(40);
        obj.setName("Edwin Aboje");
        obj.write("Asa");



        Teacher obj2 = new Teacher();
        obj2.setSalary(1_000_000);
        obj2.setName("Chibuzo Ekejiuba");
        obj2.setAge(45);
        obj2.setTeacherID("AH45dd");
        obj2.write();

    }
}
