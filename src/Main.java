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

        RestaurantMenu item1= new RestaurantMenu();
        item1.menuItem = "Kofta";
        item1.price = 250;
        item1.printItemsData();

        RestaurantMenu item2= new RestaurantMenu();
        item2.menuItem = "Rice";
        item2.price = 25;
        item2.printItemsData();

        RestaurantMenu item3= new RestaurantMenu();
        item3.menuItem = "Extra red sauce";
        item3.price = 10;
        item3.printItemsData();

        RestaurantMenu item4= new RestaurantMenu();
        item4.menuItem = "Water";
        item4.price = 5;
        item4.printItemsData();

    }
}
