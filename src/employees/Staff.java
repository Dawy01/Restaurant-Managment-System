package employees;

import javax.lang.model.element.NestingKind;

public class Staff {

    private String name;
    private int staffId;
    private double salary;

    public void printStaffData(){
        System.out.println( "Name of the first employee: " + name);
        System.out.println( "Employee ID: " + staffId);
        System.out.println( "Salary: " + salary);

    }

    public Staff(String name, int staffId, double salary){
        this.name=name;
        this.staffId=staffId;
        this.salary=salary;
    }

    public Staff (String name){
        this.name=name;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name=name;
    }

    public int getStaffId(){
        return staffId;
    }

    public void setStaffId(int staffId){
        this.staffId=staffId;
    }

    public double getSalary(){
        return salary;
    }

    public void setSalary(double salary){
        this.salary=salary;
    }


}
