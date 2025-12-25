public class RestaurantInfo {

    public static void main(String[] args) {
.
        String restaurantName = "Wings Pier";
        String streetAddress = "7008 W 10th St";
        String city = "Greeley";
        String state = "CO";
        String zip = "80634"; //updated to zip for easier reading

        //Grouping outout into one fom=rmated block to improve strcture
        System.out.println("Restaurant Information:");
        System.out.println("-----------------------");

        System.out.println("Name: " + restaurantName);
        System.out.println("Address: " + streetAddress);
        System.out.println("Location: " + city + ", " + state + " " + zip);
    }
}
