/*
Here the students class know more things.We don't need the CGPA function inside this class.
It can be implemented inside SUSTCSEDepartment class.Again we don't need the isSemesterFeePaid
class inside the Student class.It can be implemented inside the SUSTBank class.Here single responsibility characteristic is not maintained.
*/
public class Students {
    private String student_Reg_No;
    private String student_Name;
    private String student_Address;
    Students(String student_Reg_No,String student_Name,String student_Address){
        this.student_Reg_No = student_Reg_No;
        this.student_Address = student_Address;
        this.student_Name = student_Name;
    }

    public double CGPA(){
        //CGPA logic implementation
    }
    public boolean isSemesterFeePaid(){
        //Semester fee logic implementation
    }

}
