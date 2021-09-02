/*
Here the  single responsibility principle is maintained.Previously, Students class had more than one responsibility .Now it remains with a single responsibility
of maintaining students attributes.
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

}
