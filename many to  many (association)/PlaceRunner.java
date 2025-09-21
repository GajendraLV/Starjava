class PlaceRunner {
    public static void main(String[] args) {
        Chef chef1 = new Chef("Ramesh");
        Chef chef2 = new Chef("Suresh");
        Chef chef3 = new Chef("Mahesh");

        Waiter waiter1 = new Waiter(5);
        Waiter waiter2 = new Waiter(3);
        Waiter waiter3 = new Waiter(10);

        Table table1 = new Table(20);
        Table table2 = new Table(10);
        Table table3 = new Table(50);

        Restaurant restaurant = new Restaurant("Food Paradise", chef1, waiter1, table1);
        Cafe cafe = new Cafe("Coffee Corner", chef2, waiter2, table2);
        Hotel hotel = new Hotel("Luxury Stay", chef3, waiter3, table3);

        restaurant.displayRestaurantInfo();
        cafe.displayCafeInfo();
        hotel.displayHotelInfo();
    }
}