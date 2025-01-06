public class RestaurantMenu {

    private String menuItem;
    private int price;

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

    public String getMenuItem(){
        return menuItem;
    }

    public void setMenuItem(String menuItem){
        this.menuItem=menuItem;
    }

    public int getPrice(){
        return price;
    }

    public void setPrice(int price){
        this.menuItem=menuItem;
    }




}
