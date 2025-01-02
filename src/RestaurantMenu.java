public class RestaurantMenu {

    String menuItem;
    int price;

    public void printItemsData(){
        System.out.println("Item: " + menuItem);
        System.out.println("Price: " + price);
    }

    RestaurantMenu(String menuItem, int price){
        this.menuItem=menuItem;
        this.price=price;
    }

    RestaurantMenu(String menuItem){
        this.menuItem=menuItem;
        System.out.println("Price based on weight");

    }

}
