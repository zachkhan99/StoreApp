import java.util.ArrayList;
import java.util.List;

public class Store {
    private List<Product> products;
    private List<Customer> customers;

    public Store() {
        this.products = new ArrayList<>();
        this.customers = new ArrayList<>();
    }

    public void addCustomer(Customer customer) {
        customers.add(customer);
    }

    public List<Customer> getCustomers() {
        return customers;
    }

    public void removeCustomer(String name) {
        customers.removeIf(c -> c.getName().equals(name));
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public void removeProduct(String productName) {
        products.removeIf(p -> p.getProductName().equals(productName));
    }

    public void restockProduct(String productName, int quantity) {
        boolean found = false;
        for (Product product : products) {
            if (product.getProductName().equals(productName)) {
                product.setQuantity(product.getQuantity() + quantity);
                System.out.println("Product restocked: " + productName);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Product not found in inventory: " + productName);
        }
    }

    public List<Product> getProducts() {
        return products;
    }

    public void showInventory() {
        if (products.isEmpty()) {
            System.out.println("The inventory is empty.");
        } else {
            System.out.println("-- Product Inventory --");
            for (Product product : products) {
                System.out.println("Product: " + product.getProductName() + ", Quantity: " + product.getQuantity());
            }
        }
    }
}
