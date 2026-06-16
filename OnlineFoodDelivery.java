class FoodItem {

    int itemId;
    String itemName;
    double price;
    int quantity;

    
    FoodItem(int itemId, String itemName, double price, int quantity) {
        this.itemId = itemId;
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    
    double calculateAmount() {
        return price * quantity;
    }

    
    void displayItemDetails() {
        System.out.println("Item Name : " + itemName);
        System.out.println("Price : " + price);
        System.out.println("Quantity : " + quantity);
        System.out.println("Amount : " + calculateAmount());
        System.out.println();
    }
}


class Customer {

    int customerId;
    String customerName;
    String mobileNumber;


    Customer(int customerId, String customerName, String mobileNumber) {
        this.customerId = customerId;
        this.customerName = customerName;
        this.mobileNumber = mobileNumber;
    }

    // Display customer details
    void displayCustomerDetails() {
        System.out.println("Customer Name : " + customerName);
        System.out.println("Mobile Number : " + mobileNumber);
        System.out.println();
    }
}


public class OnlineFoodDelivery {

    public static void main(String[] args) {

        // Creating Customer objects
        Customer c1 = new Customer(101, "Rahul Sharma", "9876543210");
        Customer c2 = new Customer(102, "Amit Singh", "8765432109");


        // Creating FoodItem objects
        FoodItem f1 = new FoodItem(1, "Burger", 120, 2);
        FoodItem f2 = new FoodItem(2, "Pizza", 300, 1);
        FoodItem f3 = new FoodItem(3, "Pasta", 200, 2);
        FoodItem f4 = new FoodItem(4, "Cold Drink", 50, 3);


        // Order Summary
        System.out.println("----- ORDER SUMMARY -----");

        c1.displayCustomerDetails();


        f1.displayItemDetails();
        f2.displayItemDetails();
        f3.displayItemDetails();
        f4.displayItemDetails();


        // Total Bill Calculation
        double totalBill = 
                f1.calculateAmount() +
                f2.calculateAmount() +
                f3.calculateAmount() +
                f4.calculateAmount();


        System.out.println("-----------------------");
        System.out.println("Total Bill : " + totalBill);
        System.out.println("-----------------------");
    }
}
