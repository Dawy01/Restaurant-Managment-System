public class Staff {

    String name;
    int staffId;
    double salary;

    public void printStaffData(){
        System.out.println( "Name of the first employee: " + name);
        System.out.println( "Employee ID: " + staffId);
        System.out.println( "Salary: " + salary);

    }

    Staff(String name, int staffId, double salary){
        this.name=name;
        this.staffId=staffId;
        this.salary=salary;
    }

    Staff(String name){
        this.name= name;
    }


}
