
import java.util.Scanner;

class Product {
    String name;
    int price;
    int quantity;

    Product(String name, int price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    // Method to print the bill of each item purchased
    void showBill() {
        System.out.println("Billing service invoked");
        System.out.println(
            "Product name: " + name +
            " | Quantity: " + quantity +
            " | Price: " + (price * quantity)
        );
    }

    // Method to get the total bill amount
    int getTotal() {
        return price * quantity;
    }
}

// Main class
public class Main {
    public static void main(String[] args) {

        System.out.println("Welcome to the shop");

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of items purchased:");
        int size = sc.nextInt();
        sc.nextLine(); // Consume leftover newline

        Product p[] = new Product[size];

        for (int i = 0; i < size; i++) {

            System.out.println("Enter the name of the product purchased:");
            String item = sc.nextLine();

            System.out.println("Enter the price of the product:");
            int price = sc.nextInt();

            System.out.println("Enter the number of units purchased:");
            int qty = sc.nextInt();

            sc.nextLine(); // Consume leftover newline

            // Create Product object
            p[i] = new Product(item, price, qty);

            System.out.println("The item has been added to the cart");
            System.out.println();
        }

        int totalBill = 0;

        System.out.println("----- BILL -----");

        for (int i = 0; i < size; i++) {
            p[i].showBill();
            totalBill += p[i].getTotal();
        }

        System.out.println("----------------");
        System.out.println("Thanks for shopping with us!");
        System.out.println("Total bill of shopping: " + totalBill);

        sc.close();
    }
}
