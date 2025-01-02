public class Main {

    public static void main (String [] args){
        //Staff
        System.out.println("\nFirst Employee");
        Staff emplpyee1= new Staff("Ahmed", 123456, 1.500);
        emplpyee1.printStaffData();

        System.out.println("\nSecond Employee");
        Staff emplpyee2= new Staff("Ali");
        emplpyee2.printStaffData();


        //Menu
        System.out.println("\nFirst menu Item");
        RestaurantMenu item1= new RestaurantMenu("Kofta", 250);
        item1.printItemsData();

        System.out.println("\nSecond menu Item");
        RestaurantMenu item2= new RestaurantMenu("Rice", 25 );
        item2.printItemsData();

        System.out.println("\nThird menu Item");
        RestaurantMenu item3= new RestaurantMenu("Meat");
        item3.printItemsData();

        System.out.println("\nForth menu Item");
        RestaurantMenu item4= new RestaurantMenu("Water", 5);
        item4.printItemsData();

        //Chefs
        System.out.println("\nFirst Chef");
        Chefs chef1 = new Chefs("George", 38,new String[]{"CEC", "CSC", "ServSafe", "CPC", "WSET", "CMC"} );
        chef1.printChefsData();

        System.out.println("\n\nSecond Chef");
        Chefs chef2 = new Chefs("Ahmed", 38, new String[]{"CEC", "CSC","CMC"});
        chef2.printChefsData();
    }
}
