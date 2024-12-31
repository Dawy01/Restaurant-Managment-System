public class Main {

    public static void main (String [] args){

        System.out.println("\nFirst Employee");

        Staff emplpyee1= new Staff();
        emplpyee1.name = "Ahmed";
        emplpyee1.staffID= 12345;
        emplpyee1.salary=1.500;
        emplpyee1.printStaffData();

        System.out.println("\nSecond Employee");

        Staff emplpyee2= new Staff();
        emplpyee2.name = "Ali";
        emplpyee2.staffID= 123;
        emplpyee2.salary=2.500;
        emplpyee2.printStaffData();

        System.out.println("\nFirst menu Item");

        RestaurantMenu item1= new RestaurantMenu();
        item1.menuItem = "Kofta";
        item1.price = 250;
        item1.printItemsData();

        System.out.println("\nSecond menu Item");

        RestaurantMenu item2= new RestaurantMenu();
        item2.menuItem = "Rice";
        item2.price = 25;
        item2.printItemsData();

        System.out.println("\nThird menu Item");

        RestaurantMenu item3= new RestaurantMenu();
        item3.menuItem = "Extra red sauce";
        item3.price = 10;
        item3.printItemsData();

        System.out.println("\nForth menu Item");

        RestaurantMenu item4= new RestaurantMenu();
        item4.menuItem = "Water";
        item4.price = 5;
        item4.printItemsData();


        System.out.println("\nFirst Chef");
        Chefs chef1 = new Chefs();
        chef1.chefName= "George";
        chef1.age= 38;
        chef1.certifications = new String[]{"CEC", "CSC", "ServSafe", "CPC", "WSET", "CMC"};
        chef1.printChefsData();

        System.out.println("\n\nSecond Chef");
        Chefs chef2 = new Chefs();
        chef2.chefName= "Ahmed";
        chef2.age= 38;
        chef2.certifications = new String[]{"CEC", "CSC","CMC"};
        chef2.printChefsData();
    }
}
