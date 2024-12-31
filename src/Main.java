public class Main {

    public static void main (String [] args){
        Staff emplpyee1= new Staff();
        emplpyee1.name = "Ahmed";
        emplpyee1.staffID= 12345;
        emplpyee1.salary=1.500;
        emplpyee1.printStaffData();

        Staff emplpyee2= new Staff();
        emplpyee2.name = "Ali";
        emplpyee2.staffID= 123;
        emplpyee2.salary=2.500;
        emplpyee2.printStaffData();
    }
}
